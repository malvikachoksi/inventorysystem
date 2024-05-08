/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package CDI;

import AuthJWT.TokenProvider;
import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationStatus;
import static javax.security.enterprise.AuthenticationStatus.SEND_CONTINUE;
import static javax.security.enterprise.AuthenticationStatus.SUCCESS;
import javax.security.enterprise.CallerPrincipal;
import javax.security.enterprise.SecurityContext;
import static javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters.withParams;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import record.KeepRecord;

/**
 *
 * @author hp
 */
@Named(value = "sirLogin")
@Dependent
public class sirLogin {

    /**
     * Creates a new instance of sirLogin
     */
      @Inject SecurityContext ctx;
    @Inject
    TokenProvider tc;
    private String username;
    private String password;
    private Set<String> roles;
    private String errorstatus;
    private AuthenticationStatus status;
String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
   

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getErrorStatus() {
        return errorstatus;
    }

    public void setErrorStatus(String status) {
        this.errorstatus = status;
    }

    public String login()
    {
        try{
       FacesContext context = FacesContext.getCurrentInstance();
            System.err.println("MY PASS :: "+pwd);
        Credential credential = new UsernamePasswordCredential(username, new Password(pwd));
         HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
      
     status=   ctx.authenticate(request, response, withParams().credential(credential));

   // AuthenticationStatus mystatus = AuthenticationStatus.;
     
       if (status.equals(SEND_CONTINUE)) {
            // Authentication mechanism has send a redirect, should not
            // send anything to response from JSF now. The control will now go into HttpAuthenticationMechanism
           context.responseComplete();
       } 
     
     if(status.equals(SUCCESS))
        {
            String role = "";
            String url = "";
            String error = "";
       if (ctx.isCallerInRole("admin")) {
                    role = "admin";
                    url = "/Admin/admin_page.jsf";
                } else if (ctx.isCallerInRole("customer")) {
                    System.err.println("Customer");
                    role = "customer";
                    url =  "/Customer/customer_page";
                }else if (ctx.isCallerInRole("inventoryuser")) {
                    System.err.println("Inventory");
                    role = "inventoryuser";
                    url =  "/Inventoryuser/inventoryuser_page";
                }
                else {
                    error = "Role Not found..!!";
                    return "/index";
                }
                
                //status = ctx.notifyContainerAboutLogin(status);
              //    String T  = tc.createToken(username, role);
                KeepRecord.setUsername(username);
                KeepRecord.setPassword(password);
                KeepRecord.setPrincipal((CallerPrincipal) ctx.getCallerPrincipal());
                KeepRecord.setRoles(Set.of());
                //KeepRecord.setToken(T);
                
       
        }
     else
     {
          errorstatus= "User Name or Password may be wrong";
          return "/admin/Admin";
     }
       
        }
        catch(Exception e)
        {
             errorstatus= "User Name or Password may be wrong";
            e.printStackTrace();
        }
        return "";
    }
    /**
     * Creates a new instance of LoginBean
     */
    public sirLogin() {
        
       // errorstatus="";
    }
    
    public String logout()
    {
        try{
       HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
       request.logout();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "/Login.jsf";
    }
    
}
