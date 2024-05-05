/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthJWT;


import static AuthJWT.Constants.REMEMBERME_VALIDITY_SECONDS;
//import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
import io.jsonwebtoken.*;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
//import java.security.SignatureException;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.inject.Named;
/**
 *
 * @author hp
 */
@Named
public class TokenProvider implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(TokenProvider.class.getName());

    private static final String AUTHORITIES_KEY = "auth";

    private String secretKey;
    private long tokenValidity;

    @PostConstruct
    public void init() {
        // load from config
        this.secretKey = "my-secret-jwt-key";
        this.tokenValidity = TimeUnit.HOURS.toMillis(10);   //10 hours
    }

    public String createToken(String username, Set<String> authorities) {
        long now = (new Date()).getTime();
       
        System.out.println("TokenProvider - In create Token");
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("localhost")
                .claim(AUTHORITIES_KEY, authorities.stream().collect(joining(",")))
                .signWith(io.jsonwebtoken.SignatureAlgorithm.ES256, secretKey)
                //.signWith(SignatureAlgorithm.RS256, myprivateKey)
                .setExpiration(new Date(now + tokenValidity))
                .compact();
    }

    public JWTCredential getCredential(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secretKey)
               // .setSigningKey(mypublicKey)
                .parseClaimsJws(token)
                .getBody();
        System.out.println("TokenProvider - Token Provider - In Get Credential");
        Set<String> authorities
                = Arrays.asList(claims.get(AUTHORITIES_KEY).toString().split(","))
                        .stream()
                        .collect(Collectors.toSet());

        return new JWTCredential(claims.getSubject(), authorities);
    }

    public boolean validateToken(String authToken) {
        
//        try {
            System.out.println("TokenProvider - TokenProvider - validate token");
            Jws<Claims> parseClaimsJws = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(authToken);
          //Jwts.parser().setSigningKey(mypublicKey).parseClaimsJws(authToken);
            return true;
//        } catch (SignatureException e) {
//            LOGGER.log(Level.INFO, "Invalid JWT signature: {0}", e.getMessage());
//            return false;
//        }
    }
}