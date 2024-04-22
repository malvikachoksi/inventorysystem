package com.mycompany.inventory_system.resources;

import Helper.customResponse;
import ejb.DiamondSessionBeanLocal;
import entity.Categorytb;
import entity.Claritiestb;
import entity.Colortb;
import entity.Cutstb;
import entity.Fluoresencestb;
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
    public Response ping() {
        return Response
                .ok("ping")
                .build();
    }
    //    ------------------------------------CATEGORY  TABLE----------------------------------------------------------

    @GET
    @Path("/get-category")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Categorytb> getallcategory() {
      return   ejb.get_all_category();
//         return Response.ok()
//        return Response.status(Response.Status.NO_CONTENT).entity(ejb);
    }

    @POST
    @Path("/add-category/{catename}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response category_add(@PathParam("catename") String catename) {
        System.err.println("add -category" + catename);
        ejb.insert_category(catename);
        return Response.status(Response.Status.CREATED).entity(new customResponse("Success","Inserted Successfully",true,ejb.get_all_category())).build();
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
    //    -------------------------POLISHES TABLE------------------------------
    //    -------------------------SHAPE TABLE------------------------------
    //    -------------------------SYNMETRIES TABLE------------------------------
    //    -------------------------COMPANY TABLE------------------------------

}
