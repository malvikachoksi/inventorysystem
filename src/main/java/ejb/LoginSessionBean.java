/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Grouptb;
import entity.Usertb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LoginSessionBean implements LoginSessionBeanLocal {

    @PersistenceContext(unitName = "my_persistence_unit")
    EntityManager em;

    @Override
    public void Register_User(String user_name, String password, String first_name, String last_name, String phone_number,
            Integer user_type, String address, Integer city_id, Integer state_id, Integer country_id) {

        Usertb usertb = new Usertb();
        usertb.setUsername(user_name);
        usertb.setPassword(password);
        usertb.setFirstName(first_name);
        usertb.setLastName(last_name);
        usertb.setPhoneNumber(phone_number);
        usertb.setUserType(user_type);
        usertb.setAddress(address);
        usertb.setCityId(city_id);
        usertb.setStateId(state_id);
        usertb.setCountryId(country_id);
        System.err.println("---------------Password Hash---------------" + password);
        System.err.println("------------------Data from the registration----------" + user_name + password + first_name + last_name);

        Grouptb grouptb = new Grouptb();
        grouptb.setGroupname(user_name);
        grouptb.setUsername(usertb);

        System.err.println("------------Group table data insert------" + user_name + usertb);
        em.persist(grouptb);
        System.err.println("------------User Register sucecessfully  group table-------------------");

        em.persist(usertb);

        System.err.println("------------User Register sucecessfully-- user table-----------------");

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
