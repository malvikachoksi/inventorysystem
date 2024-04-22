/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Categorytb;
import entity.Claritiestb;
import entity.Colortb;
import entity.Cutstb;
import entity.Fluoresencestb;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DiamondSessionBean implements DiamondSessionBeanLocal {

    @PersistenceContext(unitName = "my_persistence_unit")
    EntityManager em;

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
    //    -------------------------POLISHES TABLE------------------------------
    //    -------------------------SHAPE TABLE------------------------------
    //    -------------------------SYNMETRIES TABLE------------------------------
    //    -------------------------COMPANY TABLE------------------------------
}
