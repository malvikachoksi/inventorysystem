/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.Categorytb;
import entity.Claritiestb;
import entity.Colortb;
import entity.Companiestb;
import entity.Cutstb;
import entity.Diamondstb;
import entity.Fluoresencestb;
import entity.Laboratoriestb;
import entity.Polishestb;
import entity.Shapetb;
import entity.Symmetriestb;
import java.util.Collection;
import javax.ejb.Local;

@Local
public interface DiamondSessionBeanLocal {

//    ----------------------Diamond TABLE--------------------------------
    public Collection<Diamondstb> diamonds_getall();
    
     void insert_diamonds2(Integer userId, Integer compayId, Integer shapeId, Integer colourId, Integer clarityId, Integer cutsId, Integer polishId, Integer fluorescenceId, Integer symmetryId, Float weigth, Float price, Boolean availability);
    public void insert_diamonds(Integer userId, Integer symmetryId, Float weigth, Float price, Boolean availability);
//
    public void delete_diamonds(Integer diamondId);
//
//    public void update_diamonds(Integer diamondId, Integer userId, Integer compayId, Integer shapeId, Integer colourId, Integer clarityId, Integer cutsId, Integer polishId, Integer fluorescenceId, Integer symmetryId, float weigth, float price, Boolean availability);

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
    public Collection<Laboratoriestb> laboratoriestbs_getall();

    public void laboratories_insert(String laboratories_name);

    public void laboratories_delete(Integer laboratories_id);

    public void laboratories_update(Integer laboratories_id, String laboratories_name);

    //    -------------------------POLISHES TABLE------------------------------
    public Collection<Polishestb> polishes_getall();

    public void polishes_insert(String polishes_name);

    public void polishes_delete(Integer polishes_id);

    public void polishes_update(Integer polishes_id, String polishes_name);
    //    -------------------------SHAPE TABLE------------------------------

    public Collection<Shapetb> shape_getall();

    public void shape_insert(String shape_name);

    public void shape_delete(Integer shape_id);

    public void shape_update(Integer shape_id, String shape_name);

    //    -------------------------SYNMETRIES TABLE------------------------------
    public Collection<Symmetriestb> symmetrie_getall();

    public void symmetrie_insert(String symmetrie_name);

    public void symmetrie_delete(Integer symmetrie_id);

    public void symmetrie_update(Integer symmetrie_id, String symmetrie_name);
    //    -------------------------COMPANY TABLE------------------------------

    public Collection<Companiestb> companie_getall();

    public void companie_insert(String companie_name);

    public void companie_delete(Integer companie_id);

    public void companie_update(Integer companie_id, String companie_name);

}
