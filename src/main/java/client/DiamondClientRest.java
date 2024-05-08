/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Jersey REST client generated for REST resource:JavaEE8Resource [rest]<br>
 * USAGE:
 * <pre>
 *        DiamondClientRest client = new DiamondClientRest();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author hp
 */
public class DiamondClientRest {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/inventorysystem/resources";

    public DiamondClientRest() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("rest");
    }

    public void cut_update(Object requestEntity, String cut_id, String cut_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-cuts/{0}/{1}", new Object[]{cut_id, cut_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallcuts(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-cuts");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void cut_delete(String cut_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-cuts/{0}", new Object[]{cut_id})).request().delete();
    }

    public <T> T ping(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void clarities_add(Object requestEntity, String clarities_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-clarities/{0}", new Object[]{clarities_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void fluoresence_add(Object requestEntity, String fluoresence_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-fluoresence/{0}", new Object[]{fluoresence_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallcompnay(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-compnay");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public Response category_add(Object requestEntity, String catename) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("add-category/{0}", new Object[]{catename})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), Response.class);
    }

    public void shape_add(Object requestEntity, String shapename) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-shape/{0}", new Object[]{shapename})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void register_user(Object requestEntity, String group_name, String username, String password, String fname, String lname, String phonenum, String usertype, String address, String cityid, String stateid, String countryid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-user/{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}/{8}/{9}/{10}", new Object[]{group_name, username, password, fname, lname, phonenum, usertype, address, cityid, stateid, countryid})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public Response diamond_add(String uid, String sysmmetryid, String weigth, String price, String avalibility) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("add-diamond/{0}/{1}/{2}/{3}/{4}", new Object[]{uid, sysmmetryid, weigth, price, avalibility})).request().post(null, Response.class);
    }

    public void color_add(Object requestEntity, String color_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-color/{0}", new Object[]{color_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void synmetries_add(Object requestEntity, String synmetriesname) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-synmetries/{0}", new Object[]{synmetriesname})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void laboratories_update(Object requestEntity, String laboratories_id, String laboratories_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-laboratories/{0}/{1}", new Object[]{laboratories_id, laboratories_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void polishe_add(Object requestEntity, String polishename) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-polishe/{0}", new Object[]{polishename})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void fluoresence_delete(String fluoresence_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-fluoresence/{0}", new Object[]{fluoresence_id})).request().delete();
    }

    public void polishe_delete(String polishe_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-polishe/{0}", new Object[]{polishe_id})).request().delete();
    }

    public void laboratories_add(Object requestEntity, String laboratoriesname) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-laboratories/{0}", new Object[]{laboratoriesname})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void cut_add(Object requestEntity, String cut_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-cuts/{0}", new Object[]{cut_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallfluoresence(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-fluoresence");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void polishe_update(Object requestEntity, String polishe_id, String polishe_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-polishe/{0}/{1}", new Object[]{polishe_id, polishe_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallcolor(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-colors");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void fluoresence_update(Object requestEntity, String fluoresence_id, String fluoresence_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-fluoresence/{0}/{1}", new Object[]{fluoresence_id, fluoresence_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void color_update(Object requestEntity, String color__id, String color_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-color/{0}/{1}", new Object[]{color__id, color_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void laboratories_delete(String laboratories_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-laboratories/{0}", new Object[]{laboratories_id})).request().delete();
    }

    public void compnay_add(Object requestEntity, String compnayname) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-compnay/{0}", new Object[]{compnayname})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallclarities(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-clarities");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T get_all_user(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-user");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getalldiamonds(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-diamond");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void category_update(Object requestEntity, String cate_id, String cate_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-category/{0}/{1}", new Object[]{cate_id, cate_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void clarities_update(Object requestEntity, String clarities_id, String clarities_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-clarities/{0}/{1}", new Object[]{clarities_id, clarities_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void shape_update(Object requestEntity, String shape_id, String shape_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-shape/{0}/{1}", new Object[]{shape_id, shape_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void color_delete(String color_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-color/{0}", new Object[]{color_id})).request().delete();
    }

    public <T> T getallsynmetries(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-synmetries");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void diamond_delete(String diamond_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-diamond/{0}", new Object[]{diamond_id})).request().delete();
    }

    public void synmetries_delete(String synmetries_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-synmetries/{0}", new Object[]{synmetries_id})).request().delete();
    }

    public void clarities_delete(String clarities_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-clarities/{0}", new Object[]{clarities_id})).request().delete();
    }

    public <T> T getallpolishe(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-polishe");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void shape_delete(String shape_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-shape/{0}", new Object[]{shape_id})).request().delete();
    }

    public <T> T getalllaboratories(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-laboratories");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void compnay_update(Object requestEntity, String compnay_id, String compnay_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-compnay/{0}/{1}", new Object[]{compnay_id, compnay_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void compnay_delete(String compnay_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-compnay/{0}", new Object[]{compnay_id})).request().delete();
    }

    public <T> T getallshape(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-shape");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getallcategory(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-category");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void diamond_add2(String uid, String compnyid, String shapeid, String colourid, String clarityid, String cutsid, String polishid, String fluorescenceId, String sysmmetryid, String weigth, String price, String avalibility) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-diamond/{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}/{8}/{9}/{10}/{11}", new Object[]{uid, compnyid, shapeid, colourid, clarityid, cutsid, polishid, fluorescenceId, sysmmetryid, weigth, price, avalibility})).request().post(null);
    }

    public void synmetries_update(Object requestEntity, String synmetries_id, String synmetries_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-synmetries/{0}/{1}", new Object[]{synmetries_id, synmetries_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void category_delete(String cate_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-category/{0}", new Object[]{cate_id})).request().delete();
    }

    public <T> T get_all_countries(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-countries");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
