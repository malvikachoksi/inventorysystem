package com.mycompany.inventory_system.resources;

import Helper.customResponse;
import ejb.DiamondSessionBeanLocal;
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
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest")
public class JavaEE8Resource {

    @EJB
    DiamondSessionBeanLocal ejb;

    @GET
        @Produces(MediaType.APPLICATION_JSON)
    public Response ping() {
        return Response
                .ok("ping")
                .build();
    }

    //    ------------------------------------DIAMOND  TABLE----------------------------------------------------------
    @GET
    @Path("/get-diamond")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Diamondstb> getalldiamonds() {
        System.err.println("log get diamond");
        return ejb.diamonds_getall();
//         return Response.ok()
//        return Response.status(Response.Status.NO_CONTENT).entity(ejb);
    }

    @DELETE
    @Path("/delete-diamond/{diamond_id}")
    public void diamond_delete(@PathParam("diamond_id") Integer diamond_id) {
        System.err.println("----Diamond Remove Id in REST API ----" + diamond_id);
        ejb.delete_diamonds(diamond_id);
    }

    @POST
    @Path("/add-diamond/{uid}/{sysmmetryid}/{weigth}/{price}/{avalibility}")
    public Response diamond_add(@PathParam("uid") Integer userId,
            @PathParam("sysmmetryid") Integer symmetryId, @PathParam("weight") float weigth,
            @PathParam("price") float price, @PathParam("avalibility") Boolean availability) {
        System.err.println("add -diamond----------rest-----" + userId + weigth);
        ejb.insert_diamonds(userId, symmetryId, weigth, price, availability);
        return Response.status(Response.Status.CREATED).entity(new customResponse("Success", "Inserted Successfully", true, ejb.diamonds_getall())).build();
    }

    
    @POST
    @Path("/add-diamond/{uid}/{compnyid}/{shapeid}/{colourid}/{clarityid}/{cutsid}/{polishid}/{fluorescenceId}/{sysmmetryid}/{weigth}/{price}/{avalibility}")
    public void diamond_add2(@PathParam("uid") Integer userId, @PathParam("compnyid") Integer compayId,
            @PathParam("shapeid") Integer shapeId, @PathParam("colourid") Integer colourId,
            @PathParam("clarityid") Integer clarityId, @PathParam("cutsid") Integer cutsId, @PathParam("polishid") Integer polishId,
            @PathParam("fluorescenceId") Integer fluorescenceId, @PathParam("sysmmetryid") Integer symmetryId, @PathParam("weigth") float weigth,
            @PathParam("price") float price, @PathParam("avalibility") Boolean availability) {
        System.err.println("add -diamond 22 ------rest api colour -------" + userId + colourId);
        System.err.println("add -diamond 22 ------rest api compnay-------" + userId + compayId);
        System.err.println("add -diamond 22 ------rest api clarity-------" + userId + clarityId);
        System.err.println("add -diamond 22 ------rest api cuts-------" + userId + cutsId);
        System.err.println("add -diamond 22 ------rest api polish-------"  + polishId);
        System.err.println("add -diamond 22 ------rest api fluorescenceId-------" +  fluorescenceId);
        System.err.println("add -diamond 22 ------rest api symmetryId-------" +  symmetryId);
        System.err.println("add -diamond 22 ------rest api wiegth-------" +weigth);
        System.err.println("add -diamond 22 ------rest api shape-------" +shapeId);
                System.err.println("Find Opration--weigth---"+weigth + "----price-----"+price+ "-----avaliboility----"+availability);
        ejb.insert_diamonds2(userId, compayId, shapeId, colourId, clarityId, cutsId, polishId, fluorescenceId, symmetryId,weigth, price, availability);
//        return Response.status(Response.Status.CREATED).entity(new customResponse("Success", "Inserted Successfully", true, ejb.diamonds_getall())).build();
    }
    //    ------------------------------------CATEGORY  TABLE----------------------------------------------------------
    @GET
    @Path("/get-category")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Categorytb> getallcategory() {
        return ejb.get_all_category();
//         return Response.ok()
//        return Response.status(Response.Status.NO_CONTENT).entity(ejb);
    }

    @POST
    @Path("/add-category/{catename}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response category_add(@PathParam("catename") String catename) {
        System.err.println("add -category" + catename);
        ejb.insert_category(catename);
        return Response.status(Response.Status.CREATED).entity(new customResponse("Success", "Inserted Successfully", true, ejb.get_all_category())).build();
    }

    @DELETE
    @Path("/delete-category/{cate_id}")
    public void category_delete(@PathParam("cate_id") Integer cate_id) {
        ejb.delete_category(cate_id);
    }

    @PUT
    @Path("/update-category/{cate_id}/{cate_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void category_update(@PathParam("cate_id") Integer cate_id, @PathParam("cate_name") String cate_name) {
        ejb.update_category(cate_id, cate_name);
    }
    //    ------------------------------------clarities  TABLE----------------------------------------------------------

    @GET
    @Path("/get-clarities")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Claritiestb> getallclarities() {
        return ejb.clarities_getall();
    }

    @POST
    @Path("/add-clarities/{clarities_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void clarities_add(@PathParam("clarities_name") String clarities_name) {
        System.err.println("add -category" + clarities_name);
        ejb.clarities_insert(clarities_name);
    }

    @DELETE
    @Path("/delete-clarities/{clarities_id}")
    public void clarities_delete(@PathParam("clarities_id") Integer clarities_id) {
        ejb.clarities_delete(clarities_id);
    }

    @PUT
    @Path("/update-clarities/{clarities_id}/{clarities_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void clarities_update(@PathParam("clarities_id") Integer clarities_id, @PathParam("clarities_name") String clarities_name) {
        ejb.clarities_update(clarities_id, clarities_name);
    }
    //    ------------------------------------color  TABLE----------------------------------------------------------

    @GET
    @Path("/get-colors")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Colortb> getallcolor() {
        return ejb.color_getall();
    }

    @POST
    @Path("/add-color/{color_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void color_add(@PathParam("color_name") String color_name) {
        System.err.println("add -category" + color_name);
        ejb.color_insert(color_name);
    }

    @DELETE
    @Path("/delete-color/{color_id}")
    public void color_delete(@PathParam("color_id") Integer color_id) {
        ejb.color_delete(color_id);
    }

    @PUT
    @Path("/update-color/{color__id}/{color_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void color_update(@PathParam("color_id") Integer color_id, @PathParam("color_name") String color_name) {
        ejb.color_update(color_id, color_name);
    }
    //    ------------------------------------cuts  TABLE----------------------------------------------------------

    @GET
    @Path("/get-cuts")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Cutstb> getallcuts() {
        return ejb.cuts_getall();
    }

    @POST
    @Path("/add-cuts/{cut_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void cut_add(@PathParam("cut_name") String cut_name) {
        System.err.println("add -category" + cut_name);
        ejb.cuts_insert(cut_name);
    }

    @DELETE
    @Path("/delete-cuts/{cut_id}")
    public void cut_delete(@PathParam("cut_id") Integer cut_id) {
        ejb.cuts_delete(cut_id);
    }

    @PUT
    @Path("/update-cuts/{cut_id}/{cut_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void cut_update(@PathParam("cut_id") Integer cut_id, @PathParam("cut_name") String cut_name) {
        ejb.cuts_update(cut_id, cut_name);
    }
    //    ------------------------------------fluoresence  TABLE----------------------------------------------------------

    @GET
    @Path("/get-fluoresence")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Fluoresencestb> getallfluoresence() {
        return ejb.fluoresence_getall();
    }

    @POST
    @Path("/add-fluoresence/{fluoresence_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void fluoresence_add(@PathParam("fluoresence_name") String fluoresence_name) {
        System.err.println("add -category" + fluoresence_name);
        ejb.fluoresence_insert(fluoresence_name);
    }

    @DELETE
    @Path("/delete-fluoresence/{fluoresence_id}")
    public void fluoresence_delete(@PathParam("fluoresence_id") Integer fluoresence_id) {
        ejb.fluoresence_delete(fluoresence_id);
    }

    @PUT
    @Path("/update-fluoresence/{fluoresence_id}/{fluoresence_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void fluoresence_update(@PathParam("fluoresence_id") Integer fluoresence_id, @PathParam("fluoresence_name") String fluoresence_name) {
        ejb.fluoresence_update(fluoresence_id, fluoresence_name);
    }

    //    -------------------------LABORATORIES TABLE------------------------------
    @GET
    @Path("/get-laboratories")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Laboratoriestb> getalllaboratories() {
        return ejb.laboratoriestbs_getall();
    }

    @POST
    @Path("/add-laboratories/{laboratoriesname}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void laboratories_add(@PathParam("laboratoriesname") String laboratoriesname) {
        ejb.laboratories_insert(laboratoriesname);
    }

    @DELETE
    @Path("/delete-laboratories/{laboratories_id}")
    public void laboratories_delete(@PathParam("laboratories_id") Integer laboratories_id) {
        ejb.laboratories_delete(laboratories_id);
    }

    @PUT
    @Path("/update-laboratories/{laboratories_id}/{laboratories_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void laboratories_update(@PathParam("laboratories_id") Integer laboratories_id, @PathParam("laboratories_name") String laboratories_name) {
        ejb.laboratories_update(laboratories_id, laboratories_name);
    }

    //    -------------------------POLISHES TABLE------------------------------
    @GET
    @Path("/get-polishe")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Polishestb> getallpolishe() {
        return ejb.polishes_getall();
    }

    @POST
    @Path("/add-polishe/{polishename}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void polishe_add(@PathParam("polishename") String polishename) {
        System.err.println("add -category" + polishename);
        ejb.polishes_insert(polishename);
    }

    @DELETE
    @Path("/delete-polishe/{polishe_id}")
    public void polishe_delete(@PathParam("polishe_id") Integer polishe_id) {
        ejb.polishes_delete(polishe_id);
    }

    @PUT
    @Path("/update-polishe/{polishe_id}/{polishe_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void polishe_update(@PathParam("polishe_id") Integer polishe_id, @PathParam("polishe_name") String polishe_name) {
        ejb.polishes_update(polishe_id, polishe_name);
    }

    //    -------------------------SHAPE TABLE------------------------------
    @GET
    @Path("/get-shape")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Shapetb> getallshape() {
        return ejb.shape_getall();
    }

    @POST
    @Path("/add-shape/{shapename}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void shape_add(@PathParam("shapename") String shapename) {
        ejb.shape_insert(shapename);
    }

    @DELETE
    @Path("/delete-shape/{shape_id}")
    public void shape_delete(@PathParam("shape_id") Integer shape_id) {
        ejb.shape_delete(shape_id);
    }

    @PUT
    @Path("/update-shape/{shape_id}/{shape_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void shape_update(@PathParam("shape_id") Integer shape_id, @PathParam("shape_name") String shape_name) {
        ejb.shape_update(shape_id, shape_name);
    }

    //    -------------------------SYNMETRIES TABLE------------------------------
    @GET
    @Path("/get-synmetries")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Symmetriestb> getallsynmetries() {
        return ejb.symmetrie_getall();
    }

    @POST
    @Path("/add-synmetries/{synmetriesname}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void synmetries_add(@PathParam("synmetriesname") String synmetriesname) {
        ejb.symmetrie_insert(synmetriesname);
    }

    @DELETE
    @Path("/delete-synmetries/{synmetries_id}")
    public void synmetries_delete(@PathParam("synmetries_id") Integer synmetries_id) {
        ejb.symmetrie_delete(synmetries_id);
    }

    @PUT
    @Path("/update-synmetries/{synmetries_id}/{synmetries_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void synmetries_update(@PathParam("synmetries_id") Integer synmetries_id, @PathParam("synmetries_name") String synmetries_name) {
        ejb.symmetrie_update(synmetries_id, synmetries_name);
    }

    //    -------------------------COMPANY TABLE------------------------------
    @GET
    @Path("/get-compnay")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Companiestb> getallcompnay() {
        return ejb.companie_getall();
    }

    @POST
    @Path("/add-compnay/{compnayname}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void compnay_add(@PathParam("compnayname") String compnayname) {
        ejb.companie_insert(compnayname);
    }

    @DELETE
    @Path("/delete-compnay/{compnay_id}")
    public void compnay_delete(@PathParam("compnay_id") Integer compnay_id) {
        ejb.companie_delete(compnay_id);
    }

    @PUT
    @Path("/update-compnay/{compnay_id}/{compnay_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void compnay_update(@PathParam("compnay_id") Integer compnay_id, @PathParam("compnay_name") String compnay_name) {
        ejb.color_update(compnay_id, compnay_name);
    }

}
