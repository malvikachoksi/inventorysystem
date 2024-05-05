/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Categorytb;
import entity.Claritiestb;
import entity.Colortb;
import entity.Companiestb;
import entity.Cutstb;
import entity.Diamondstb;
import entity.Fluoresencestb;
import entity.Grouptb;
import entity.Laboratoriestb;
import entity.Polishestb;
import entity.Shapetb;
import entity.Symmetriestb;
import entity.Usertb;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;

@Stateless
public class DiamondSessionBean implements DiamondSessionBeanLocal {

    @PersistenceContext(unitName = "my_persistence_unit")
    EntityManager em;
    Pbkdf2PasswordHashImpl B = new Pbkdf2PasswordHashImpl();
    //    ------------------------------------CATEGORY  TABLE----------------------------------------------------------
    @Override
    public Collection<Categorytb> get_all_category() {
        return em.createNamedQuery("Categorytb.findAll").getResultList();
    }

    @Override
    public void insert_category(String category_name) {
        Categorytb c = new Categorytb();
        c.setCateName(category_name);
        em.persist(c);
    }

    @Override
    public void delete_category(Integer cateid) {
        Categorytb c = em.find(Categorytb.class, cateid);
        em.remove(c);
    }

    @Override
    public void update_category(Integer cateid, String category_name) {
        Categorytb c = em.find(Categorytb.class, cateid);
        c.setCateName(category_name);
        em.merge(c);
    }

//    ------------------------------------CLARITIES TABLE----------------------------------------------------------
    @Override
    public Collection<Claritiestb> clarities_getall() {
        return em.createNamedQuery("Claritiestb.findAll").getResultList();
    }

    @Override
    public void clarities_insert(String clarities_name) {
        Claritiestb clarities = new Claritiestb();
        clarities.setClaritiesName(clarities_name);
        em.persist(clarities);
    }

    @Override
    public void clarities_delete(Integer clarities_id) {
        Claritiestb clarities = em.find(Claritiestb.class, clarities_id);
        em.remove(clarities);
    }

    @Override
    public void clarities_update(Integer clarities_id, String clarities_name) {
        Claritiestb clarities = em.find(Claritiestb.class, clarities_id);
        clarities.setClaritiesName(clarities_name);
        em.merge(clarities);
    }

    //    ------------------------------------COLOR  TABLE----------------------------------------------------------
    @Override
    public Collection<Colortb> color_getall() {
        return em.createNamedQuery("Colortb.findAll").getResultList();
    }

    @Override
    public void color_insert(String color_name) {
        Colortb color = new Colortb();
        color.setColorName(color_name);
        em.persist(color);
    }

    @Override
    public void color_delete(Integer color_id) {
        Colortb color = em.find(Colortb.class, color_id);
        em.remove(color);
    }

    @Override
    public void color_update(Integer color_id, String color_name) {
        Colortb color = em.find(Colortb.class, color_id);
        color.setColorName(color_name);
        em.merge(color);
    }
    //    ------------------------------------CUTS  TABLE----------------------------------------------------------

    @Override
    public Collection<Cutstb> cuts_getall() {
        return em.createNamedQuery("Cutstb.findAll").getResultList();
    }

    @Override
    public void cuts_insert(String cuts_name) {
        Cutstb cuts = new Cutstb();
        cuts.setCutName(cuts_name);
        em.persist(cuts);
    }

    @Override
    public void cuts_delete(Integer cuts_id) {
        Cutstb cuts = em.find(Cutstb.class, cuts_id);
        em.remove(cuts);
    }

    @Override
    public void cuts_update(Integer cuts_id, String cuts_name) {
        Cutstb cuts = em.find(Cutstb.class, cuts_id);
        cuts.setCutName(cuts_name);
        em.merge(cuts);
    }

//    -----------------------------------FLUORESENCES TABLE--------------------------------------------
    @Override
    public Collection<Fluoresencestb> fluoresence_getall() {
        return em.createNamedQuery("Fluoresencestb.findAll").getResultList();

    }

    @Override
    public void fluoresence_insert(String fluoresence_name) {
        Fluoresencestb f = new Fluoresencestb();
        f.setFluoresenceName(fluoresence_name);
        em.persist(f);
    }

    @Override
    public void fluoresence_delete(Integer fluoresence_id) {
        Fluoresencestb f = em.find(Fluoresencestb.class, fluoresence_id);
        em.remove(f);
    }

    @Override
    public void fluoresence_update(Integer fluoresence_id, String fluoresence_name) {
        Fluoresencestb f = em.find(Fluoresencestb.class, fluoresence_id);
        f.setFluoresenceName(fluoresence_name);
        em.merge(f);
    }

    //    -------------------------LABORATORIES TABLE------------------------------
    @Override
    public Collection<Laboratoriestb> laboratoriestbs_getall() {

        return em.createNamedQuery("Laboratoriestb.findAll").getResultList();
    }

    @Override
    public void laboratories_insert(String laboratories_name) {
        Laboratoriestb l = new Laboratoriestb();
        l.setLaboratoriesName(laboratories_name);
        em.persist(l);
    }

    @Override
    public void laboratories_delete(Integer laboratories_id) {
        Laboratoriestb l = em.find(Laboratoriestb.class, laboratories_id);
        em.remove(l);
    }

    @Override
    public void laboratories_update(Integer laboratories_id, String laboratories_name) {
        Laboratoriestb l = em.find(Laboratoriestb.class, laboratories_id);
        l.setLaboratoriesName(laboratories_name);
        em.merge(l);
    }
    //    -------------------------POLISHES TABLE------------------------------

    @Override
    public Collection<Polishestb> polishes_getall() {
        return em.createNamedQuery("Polishestb.findAll").getResultList();
    }

    @Override
    public void polishes_insert(String polishes_name) {
        Polishestb p = new Polishestb();
        p.setPolisheName(polishes_name);
        em.persist(p);
    }

    @Override
    public void polishes_delete(Integer polishes_id) {
        Polishestb p = em.find(Polishestb.class, polishes_id);
        em.remove(p);
    }

    @Override
    public void polishes_update(Integer polishes_id, String polishes_name) {
        Polishestb p = em.find(Polishestb.class, polishes_id);
        p.setPolisheName(polishes_name);
        em.merge(p);
    }
//    -------------------------SHAPE TABLE------------------------------

    @Override
    public Collection<Shapetb> shape_getall() {
        return em.createNamedQuery("Shapetb.findAll").getResultList();
    }

    @Override
    public void shape_insert(String shape_name) {
        Shapetb c = new Shapetb();
        c.setShapeName(shape_name);
        em.persist(c);
    }

    @Override
    public void shape_delete(Integer shape_id) {
        Shapetb s = em.find(Shapetb.class, shape_id);
        em.remove(s);
    }

    @Override
    public void shape_update(Integer shape_id, String shape_name) {
        Shapetb c = em.find(Shapetb.class, shape_id);
        c.setShapeName(shape_name);
        em.merge(c);

    }
    //    -------------------------SYNMETRIES TABLE------------------------------

    @Override
    public Collection<Symmetriestb> symmetrie_getall() {
        return em.createNamedQuery("Symmetriestb.findAll").getResultList();
    }

    @Override
    public void symmetrie_insert(String symmetrie_name) {
        Symmetriestb c = new Symmetriestb();
        c.setSymmetrieName(symmetrie_name);
        em.persist(c);
    }

    @Override
    public void symmetrie_delete(Integer symmetrie_id) {
        Symmetriestb c = em.find(Symmetriestb.class, symmetrie_id);
        em.remove(c);
    }

    @Override
    public void symmetrie_update(Integer symmetrie_id, String symmetrie_name) {
        Symmetriestb c = em.find(Symmetriestb.class, symmetrie_id);
        c.setSymmetrieName(symmetrie_name);
        em.merge(c);
    }
    //    -------------------------COMPANY TABLE------------------------------

    @Override
    public Collection<Companiestb> companie_getall() {
        return em.createNamedQuery("Companiestb.findAll").getResultList();
    }

    @Override
    public void companie_insert(String companie_name) {
        Companiestb c = new Companiestb();
        c.setCompnayName(companie_name);
        em.persist(c);
    }

    @Override
    public void companie_delete(Integer companie_id) {
        Companiestb c = em.find(Companiestb.class, companie_id);
        em.remove(c);
    }

    @Override
    public void companie_update(Integer companie_id, String companie_name) {
        Companiestb c = em.find(Companiestb.class, companie_id);
        c.setCompnayName(companie_name);
        em.merge(c);
    }
    //    ------------------------------------DIAMOND  TABLE----------------------------------------------------------

    @Override
    public Collection<Diamondstb> diamonds_getall() {
        return em.createNamedQuery("Diamondstb.findAll").getResultList();
    }

    @Override
    public void delete_diamonds(Integer diamondId) {
        Diamondstb diamondstbId = em.find(Diamondstb.class, diamondId);
        System.err.println("-------------Diamond Delete Ejb Sucessfuulyy---------------");
        em.remove(diamondstbId);
    }

    @Override
    public void insert_diamonds(Integer userId, Integer symmetryId, Float weigth, Float price, Boolean availability) {
//        Usertb usertbId=em.find(Usertb.class, userId);
//        Companiestb companiestbId = em.find(Companiestb.class, compayId);
//        Shapetb shapetbId = em.find(Shapetb.class, shapeId);
//        Colortb colortbId = em.find(Colortb.class, colourId);
//        Claritiestb claritiestbId = em.find(Claritiestb.class, clarityId);
//        Cutstb cutstbId = em.find(Cutstb.class, cutsId);
//        Polishestb polishestbId = em.find(Polishestb.class, polishId);
//        Fluoresencestb fluoresencestbId = em.find(Fluoresencestb.class, fluorescenceId);
        Symmetriestb symmetriestbId = em.find(Symmetriestb.class, symmetryId);
//
        Diamondstb d = new Diamondstb();
        d.setUserId(userId);
//        d.setCompnayId(companiestbId);
//        d.setShapeId(shapetbId);
//        d.setColourId(colortbId);
//        d.setClarityId(claritiestbId);
//        d.setCutId(cutstbId);
//        d.setPolishId(polishestbId);
//        d.setFluorescenceId(fluoresencestbId);
        d.setSymmetriestb(symmetriestbId);
        d.setWeigth(weigth);
        d.setPrice(price);
        d.setAvailability(availability);
        System.err.println("=============persistes=============" + userId + symmetriestbId + weigth + price + availability);

//        companiestbId.getDiamondstbCollection().add(d);
//        shapetbId.getDiamondstbCollection().add(d);
//        colortbId.getDiamondstbCollection().add(d);
//        claritiestbId.getDiamondstbCollection().add(d);
//        cutstbId.getDiamondstbCollection().add(d);
//        polishestbId.getDiamondstbCollection().add(d);
//        fluoresencestbId.getDiamondstbCollection().add(d);
        symmetriestbId.getDiamondstb();
//
        em.persist(d);
        em.merge(symmetriestbId);
        System.err.println("=============persistes=============");
//        em.merge(companiestbId);
//        em.merge(shapetbId);
//        em.merge(colortbId);
//        em.merge(claritiestbId);
//        em.merge(cutstbId);
//        em.merge(fluoresencestbId);
        em.merge(symmetriestbId);
        System.err.println("=============marge=============");
        System.err.println("---------------------Diamond Add sucessfully --------------");

    }

    @Override
    public void insert_diamonds2(Integer userId, Integer compayId, Integer shapeId, Integer colourId, Integer clarityId, Integer cutsId, Integer polishId, Integer fluorescenceId, Integer symmetryId, Float weigth, Float price, Boolean availability) {
        System.err.println("----------Ejb--------Calll---------1---------" + userId + compayId + shapeId + colourId + clarityId + cutsId + polishId + fluorescenceId + symmetryId + weigth + price + availability);
        Companiestb companiestbId = null;
        Shapetb shapetbId = null;
        Colortb colortbId = null;
        Claritiestb claritiestbId = null;
        Cutstb cutstbId = null;
        Polishestb polishestbId = null;
        Fluoresencestb fluoresencestbId = null;
//        Symmetriestb symmetriestbId = null;

        if (cutsId != null) {
            System.err.println("Id cuts---------" + cutsId);
            cutstbId = em.find(Cutstb.class, cutsId);
        } else {
            System.err.println("cuts Table Id null");
            // Handle the case when symmetryId is null
        }

        if (compayId != null) {
            System.err.println("Id compnay---------" + compayId);
            companiestbId = em.find(Companiestb.class, compayId);
        } else {
            System.err.println("compnay Table Id null");
            // Handle the case when symmetryId is null
        }

        if (shapeId != null) {
            shapetbId = em.find(Shapetb.class, shapeId);
        } else {
            System.err.println("shape Table Id null");

            // Handle the case when symmetryId is null
        }

        if (colourId != null) {
            colortbId = em.find(Colortb.class, colourId);
        } else {
            System.err.println("color Table Id null");
            // Handle the case when symmetryId is null
        }

        if (clarityId != null) {
            claritiestbId = em.find(Claritiestb.class, clarityId);
        } else {
            System.err.println("clarity Table Id null");

            // Handle the case when symmetryId is null
        }
        if (fluorescenceId != null) {
            fluoresencestbId = em.find(Fluoresencestb.class, fluorescenceId);
        } else {
            System.err.println("fluoresencestbId Table Id null");

            // Handle the case when symmetryId is null
        }
        if (polishId != null) {
            polishestbId = em.find(Polishestb.class, polishId);
        } else {
            System.err.println("polish Table Id null");

            // Handle the case when symmetryId is null
        }
        if (cutsId != null) {
            System.err.println("Custs Id " + cutsId);
            cutstbId = em.find(Cutstb.class, cutsId);
            System.err.println("Custs Id null of not " + cutstbId);
        } else {
            System.err.println("cuts Table Id null" + cutsId);
            // Handle the case when symmetryId is null
        }
//        if (symmetryId != null) {
//            symmetriestbId = em.find(Symmetriestb.class, symmetryId);
//        } else {
//            System.err.println("Symmetries Table Id null");
//        }
        System.err.println("----------Ejb--------Calll-- 2----------------" + userId + compayId + shapeId + colourId + clarityId + cutsId + polishId + fluorescenceId + symmetryId + weigth + price + availability);

        Diamondstb d = new Diamondstb();
        d.setUserId(userId);
        d.setCompnayId(companiestbId);
        d.setShapeId(shapetbId);
        d.setColourId(colortbId);
        d.setClarityId(claritiestbId);
        d.setCutId(cutstbId);
        d.setPolishId(polishestbId);
        d.setFluorescenceId(fluoresencestbId);
        d.setSymmetryId(symmetryId);
        d.setWeigth(weigth);
        d.setPrice(price);
        d.setAvailability(availability);
        System.err.println("----------Ejb--------Calll-- 3----------------" + userId + compayId + shapeId + colourId + clarityId + cutsId + polishId + fluorescenceId + symmetryId + weigth + price + availability);

        System.err.println("=============persistes 2=============" + userId + weigth + price + availability + userId + compayId + shapeId + colourId + clarityId + cutsId + polishId + fluorescenceId + symmetryId + weigth);

//        companiestbId.getDiamondstbCollection().add(d);
//        shapetbId.getDiamondstbCollection().add(d);
//        colortbId.getDiamondstbCollection().add(d);
//        claritiestbId.getDiamondstbCollection().add(d);
//        cutstbId.getDiamondstbCollection().add(d);
//        polishestbId.getDiamondstbCollection().add(d);
//        fluoresencestbId.getDiamondstbCollection().add(d);
//        symmetriestbId.getDiamondstb();
//
        em.persist(d);
//        em.merge(symmetriestbId);
        System.err.println("=============persistes 2=============");
        em.merge(companiestbId);
        em.merge(shapetbId);
        em.merge(colortbId);
        em.merge(claritiestbId);
        em.merge(cutstbId);
        em.merge(fluoresencestbId);
//        em.merge(symmetriestbId);
        System.err.println("=============marge 2=============");
        System.err.println("---------------------Diamond Add sucessfully2 --------------");

//-------------------------------------
//         Diamondstb diamond = new Diamondstb();
//        diamond.setUserId(userId);
//        diamond.setCompnayId(em.find(Companiestb.class, compayId));
//        diamond.setShapeId(em.find(Shapetb.class, shapeId));
//        diamond.setColourId(em.find(Colortb.class, colourId));
//        diamond.setClarityId(em.find(Claritiestb.class, clarityId));
//        diamond.setCutId(em.find(Cutstb.class, cutsId));
//        diamond.setPolishId(em.find(Polishestb.class, polishId));
//        diamond.setFluorescenceId(em.find(Fluoresencestb.class, fluorescenceId));
//        diamond.setSymmetryId(symmetryId);
//        diamond.setWeigth(weigth);
//        diamond.setPrice(price);
//        diamond.setAvailability(availability);
//                System.err.println("=============post data============="+userId+symmetryId+weigth+price+availability);
//                System.err.println("=============post data foreign============="+compayId+polishId);
//
//        em.persist(diamond);
//         System.err.println("=============marge=============");
//        System.err.println("---------------------Diamond Add sucessfully --------------");
    }

    @Override
    public void Register_User(String group_name,String user_name, String password, String first_name, String last_name, String phone_number, Integer user_type, String address, Integer city_id, Integer state_id, Integer country_id) {

//        String hashpassword = pb.generate(password.toCharArray());
        Usertb usertb = new Usertb();
        usertb.setUsername(user_name);
        usertb.setPassword(B.generate(password.toCharArray()));
        usertb.setFirstName(first_name);
        usertb.setLastName(last_name);
        usertb.setPhoneNumber(phone_number);
        usertb.setUserType(user_type);
        usertb.setAddress(address);
        usertb.setCityId(city_id);
        usertb.setStateId(state_id);
        usertb.setCountryId(country_id);
//        System.err.println("---------------Password Hash---------------" + hashpassword);
        System.err.println("------------------Data from the registration----------" + user_name + password + first_name + last_name);

        Grouptb grouptb = new Grouptb();
        grouptb.setGroupname(group_name);
        grouptb.setUsername(usertb);

        System.err.println("------------Group table data insert------" + B.generate(password.toCharArray()));
        em.persist(grouptb);
        System.err.println("------------User Register sucecessfully  group table-------------------");

        em.persist(usertb);

        System.err.println("------------User Register sucecessfully-- user table-----------------");

    }

    @Override
    public Collection<Usertb> getalluser() {
        return em.createNamedQuery("Usertb.findAll").getResultList();
    }

}
