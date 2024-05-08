/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package CDI;

import static AuthJWT.Constants.AUTHORIZATION_HEADER;
import static AuthJWT.Constants.BEARER;
import AuthJWT.TokenProvider;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationException;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.CallerPrincipal;
import javax.security.enterprise.SecurityContext;
import javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import javax.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStoreHandler;
//import javax.security.enterprise.identitystore.IdentityStoreHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;
import record.KeepRecord;

/**
 *
 * @author hp
 */
@Named(value = "loginCDI")
@RequestScoped
public class loginBean implements  Serializable {

    
    @Inject
    SecurityContext ctx;

//    @Inject IdentityStoreHandler handler;
    @Inject
    TokenProvider tc;
    String uname;
    String pwd;
    String error;
    String roles;
    String token;
//    CredentialValidationResult result;
//AuthenticationStatus Status;
    
//    private AuthenticationStatus createToken(CredentialValidationResult result, HttpMessageContext context) {
////        if (!isRememberMe(context)) {
//            // if (true) {
//             String jwt = tc.createToken(result.getCallerPrincipal().getName(), result.getCallerGroups());
//            //context.getRequest().getSession().setAttribute("token", jwt);
////            KeepRecord.setToken(jwt);
//            context.getResponse().addHeader(AUTHORIZATION_HEADER, BEARER + jwt);
//            System.out.println("Token Value"+ jwt);
//        
//           
////        }
//        System.out.println("JWTAuthenticationMechanism - Token Created");
//        
//        return context.notifyContainerAboutLogin(result.getCallerPrincipal(), result.getCallerGroups());
//    }

    public String login() {
        try {
//            Pbkdf2PasswordHashImpl B = new Pbkdf2PasswordHashImpl();

            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//            System.err.println("login function " + B.generate(pwd.toCharArray()));
            System.err.println("login function " + " " + pwd + " " + "Hello");
            System.err.println("request" + getUname());
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            System.err.println("response" + response);
            Credential credential = new UsernamePasswordCredential(uname, new Password(pwd));
//                     result = handler.validate(credential);
//              AuthenticationStatus status = createToken(result, (HttpMessageContext) ctx);

            AuthenticationStatus status = ctx.authenticate(request, response, AuthenticationParameters.withParams().credential(credential));
//            System.err.println("status" + status + "  " + AuthenticationStatus.SUCCESS);
            if (status == AuthenticationStatus.SUCCESS) {
//            if(result.getStatus()==CredentialValidationResult.Status.VALID) {
//              AuthenticationStatus status = createToken(result, (HttpMessageContext) ctx);
//              status = ctx.(result);

//                keepRecord.setUname(uname);
//                keepRecord.setPwd(pwd);
                
//                System.err.println("username" + uname + " " + B.generate(pwd.toCharArray()));
                System.err.println("role" + ctx.getCallerPrincipal().getName());
                System.err.println("here" + ctx.isCallerInRole("customer"));
                System.err.println("here" + ctx.isCallerInRole("admin"));
                 
                String url  = "";
                if (ctx.isCallerInRole("admin")) {

//                   
                
                    roles = "admin";
                   
                    url = "/Admin/admin_page.jsf";
                    
                 
                } else if (ctx.isCallerInRole("customer")) {
                    System.err.println("Customer");
                    roles = "customer";
                    url =  "/Customer/customer_page";
                }else if (ctx.isCallerInRole("inventoryuser")) {
                    System.err.println("Inventory");
                    roles = "inventoryuser";
                    url =  "/Inventoryuser/inventoryuser_page";
                }
                else {
                    error = "Role Not found..!!";
                    return "/index";
                }
                
                //status = ctx.notifyContainerAboutLogin(status);
                String T  = tc.createToken(uname, roles);
                setToken(T);

                KeepRecord.setUsername(uname);
                KeepRecord.setPassword(pwd);
                KeepRecord.setPrincipal((CallerPrincipal) ctx.getCallerPrincipal());
                KeepRecord.setRoles(roles);
                KeepRecord.setToken(token);
                
                System.out.println("CDI.loginBean.login() + token" + token);
                System.out.println("CDI.loginBean.login() + KeepRecordtoken" + KeepRecord.getToken());
                
                response.setHeader("Authantication", "Bearer "+token);
//                request.setAttribute("Authantication", );
                return url;
            } else {
                                    System.err.println("ERROR");

                error = "User Not found..!!";
                return "/Login";
            }
        } catch (Exception e) {
            error = e.getMessage();
            return "";
        }

    }

//      public String login() {
//        try {
//            Pbkdf2PasswordHashImpl B = new Pbkdf2PasswordHashImpl();
//
//            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//            System.err.println("login function " + B.generate(pwd.toCharArray()));
//            System.err.println("login function " + " " + pwd + " " + "Hello");
////            System.err.println("request" + getUname());
//            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//            System.err.println("JWT response" + response);
//            Credential credential = new UsernamePasswordCredential(uname, new Password(pwd));
//                     result = handler.validate(credential);
////              AuthenticationStatus status = createToken(result, (HttpMessageContext) ctx);
//
////            AuthenticationStatus status = ctx.authenticate(request, response, AuthenticationParameters.withParams().credential(credential));
////            System.err.println("status" + status + "  " + AuthenticationStatus.SUCCESS);
////            if (status == AuthenticationStatus.SUCCESS) {
//            if(result.getStatus()==CredentialValidationResult.Status.VALID) {
//                        System.err.println("JWT ::: "+result);
//
//              AuthenticationStatus status = createToken(result, (HttpMessageContext) ctx);
//
////              status = ctx.(result);
//
////              if(request.getRequestURI().contains("index.jsp"))
////              {
//                  request.setAttribute("user", result.getCallerPrincipal().getName());
//                  if(result.getCallerGroups().contains("admin"))
//                          {
//                              roles = "admin";
//                    return "/Admin/admin_page.jsf";
//                             
//                          }
//                  else if(result.getCallerGroups().contains("customer"))
//                          {
//                              
//                              roles = "customer";
////                    return "/Admin/admin_page.jsf";
//                          }
//                  
//                  
////              }
//              
//          }
//          else
//          {
//              System.err.println("JWT :: ELSE");
//              request.setAttribute("error", "User Name and Password do not match with our records ..");
////              request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
////              return ctx./*doNothing*/();
//          }
//            
//        } catch (Exception e) {
//            error = e.getMessage();
//            return "";
//        }
//        return "Error";
//    }
//    public String logout() {
//        try {
//            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//            HttpSession session = request.getSession();
//            session.invalidate();
//            request.logout();
////            keepRecord.reset();
//            return "/index";
//        } catch (ServletException e) {
//            error = e.getMessage();
//            return "/index";
//        }
//
//    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
      //this.token = KeepRecord.getToken();
    }
    
    
    

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public loginBean() {
    }

//    @Override
//    public AuthenticationStatus validateRequest(HttpServletRequest hsr, HttpServletResponse hsr1, HttpMessageContext hmc) throws AuthenticationException {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public AuthenticationStatus secureResponse(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) throws AuthenticationException {
//        return HttpAuthenticationMechanism.super.secureResponse(request, response, httpMessageContext); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
//
//    @Override
//    public void cleanSubject(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) {
//        HttpAuthenticationMechanism.super.cleanSubject(request, response, httpMessageContext); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }

//    @Override
//    public AuthenticationStatus validateRequest(HttpServletRequest hsr, HttpServletResponse hsr1, HttpMessageContext hmc) throws AuthenticationException {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        return null;
//        
//    }

}
