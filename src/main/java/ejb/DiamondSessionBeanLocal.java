/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.Categorytb;
import entity.Claritiestb;
import entity.Colortb;
import entity.Cutstb;
import entity.Fluoresencestb;
import java.util.Collection;
import javax.ejb.Local;

@Local
public interface DiamondSessionBeanLocal {

//    here created all method of the table to perfome the curd opertion
//    total 10 table is there for the opration
//    insert,update,delete,select
//    ----------------------CATEGORY TABLE--------------------------------
    public Collection<Categorytb> get_all_category();

    public void insert_category(String category_name);

    public void delete_category(Integer cateid);

    public void update_category(Integer cateid, String category_name);

//    -------------------------CLARITIES TABLE------------------------------
    public Collection<Claritiestb> clarities_getall();

    public void clarities_insert(String clarities_name);

    public void clarities_delete(Integer clarities_id);

    public void clarities_update(Integer clarities_id, String clarities_name);

//    -------------------------COLOR TABLE------------------------------
    public Collection<Colortb> color_getall();

    public void color_insert(String color_name);

    public void color_delete(Integer color_id);

    public void color_update(Integer color_id, String color_name);
//    -------------------------CUTS TABLE------------------------------

    public Collection<Cutstb> cuts_getall();

    public void cuts_insert(String cuts_name);

    public void cuts_delete(Integer cuts_id);

    public void cuts_update(Integer cuts_id, String cuts_name);
//    -------------------------FLUORESENCES TABLE------------------------------

    public Collection<Fluoresencestb> fluoresence_getall();

    public void fluoresence_insert(String fluoresence_name);

    public void fluoresence_delete(Integer fluoresence_id);

    public void fluoresence_update(Integer fluoresence_id, String fluoresence_name);
    //    -------------------------LABORATORIES TABLE------------------------------
    //    -------------------------POLISHES TABLE------------------------------
    //    -------------------------SHAPE TABLE------------------------------
    //    -------------------------SYNMETRIES TABLE------------------------------
    //    -------------------------COMPANY TABLE------------------------------

}
