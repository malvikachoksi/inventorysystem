/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package CDI;

import client.DiamondClientRest;
import ejb.DiamondSessionBeanLocal;
import entity.Diamondstb;
import entity.Usertb;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@Named(value = "userCDIBean")
@RequestScoped
public class UserCDIBean {

    @EJB
    DiamondSessionBeanLocal ejb;     
            
    Response response;
    DiamondClientRest diamondClientRest;

    Usertb usertb;
    Usertb u = new Usertb();
    GenericType<List<Usertb>> genericTypeUser;
    List<Usertb> usertbs;
    
    String searchUserQry;

    public String getSearchUserQry() {
        return searchUserQry;
    }

    public void setSearchUserQry(String searchUserQry) {
        this.searchUserQry = searchUserQry;
    }

    
    
    public Usertb getU() {
        return u;
    }

    public void setU(Usertb u) {
        this.u = u;
    }

    public Usertb getUsertb() {
        return usertb;
    }

    public void setUsertb(Usertb usertb) {
        this.usertb = usertb;
    }

    public Usertb getUsertb1() {
        return u;
    }

    public void setUsertb1(Usertb usertb1) {
        this.u = usertb1;
    }

    public List<Usertb> getUsertbs() {
           
         System.err.println("Sdsdsdsdsdsd getUsertbs"+searchUserQry);
        if(searchUserQry == null || searchUserQry.isEmpty()){
            response=diamondClientRest.get_all_user(Response.class);
            System.err.println("Response " + response);
            usertbs = response.readEntity(genericTypeUser);
            System.err.println("User get cdi bean" + usertbs);
        }
        else{
            usertbs = (List<Usertb>) ejb.searchUser(searchUserQry);
        }
        
        return usertbs;
    }

    public void setUsertbs(List<Usertb> usertbs) {
        this.usertbs = usertbs;
    }

    public UserCDIBean() {

        diamondClientRest = new DiamondClientRest();
        usertb = new Usertb();
        genericTypeUser = new GenericType<List<Usertb>>() {
        };
        usertbs = new ArrayList<Usertb>();

    }
    
    public void searchData(){
//        usertbs = ;
         System.err.println("sdsd"+searchUserQry);
        if(searchUserQry != null && !searchUserQry.isEmpty()){
    

            setUsertbs((List<Usertb>) ejb.searchUser(searchUserQry));
            System.err.println("Sdsdsdsdddddd"+searchUserQry);
        }
    }

}
