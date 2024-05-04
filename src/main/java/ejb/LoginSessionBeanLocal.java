/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import javax.ejb.Local;

@Local
public interface LoginSessionBeanLocal {
    void Register_User(String user_name,String password,String first_name,String last_name,String phone_number,Integer user_type,String address,Integer city_id,Integer state_id,Integer country_id);
}
