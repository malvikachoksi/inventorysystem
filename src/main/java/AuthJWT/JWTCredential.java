/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthJWT;
import java.io.Serializable;
import java.util.Set;
//import javax.enterprise.context.SessionScoped;
import javax.security.enterprise.credential.Credential;
/**
 *
 * @author hp
 */
public class JWTCredential implements Credential, Serializable {

    private final String principal;
    private final Set<String> authorities;

    public JWTCredential(String principal, Set<String> authorities) {
        this.principal = principal;
        this.authorities = authorities;
    }

    public String getPrincipal() {
        return principal;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

}