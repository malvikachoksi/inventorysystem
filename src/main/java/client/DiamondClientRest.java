/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

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
 * @author DELL
 */
public class DiamondClientRest {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Inventory_System/resources";

    public DiamondClientRest() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("rest");
    }

    public void cut_update(Object requestEntity, String cut_id, String cut_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-cut/{0}/{1}", new Object[]{cut_id, cut_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallclarities(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-clarities");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getallcuts(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-cuts");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void cut_delete(String cut_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-cut/{0}", new Object[]{cut_id})).request().delete();
    }

//    public <T> T ping(Class<T> responseType) throws ClientErrorException {
//        WebTarget resource = webTarget;
//        return resource.get(responseType);
//    }

    public void category_update(Object requestEntity, String cate_id, String cate_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-category/{0}/{1}", new Object[]{cate_id, cate_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void clarities_update(Object requestEntity, String clarities_id, String clarities_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-clarities/{0}/{1}", new Object[]{clarities_id, clarities_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void color_delete(String color_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-color/{0}", new Object[]{color_id})).request().delete();
    }

    public void clarities_add(Object requestEntity, String clarities_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-clarities/{0}", new Object[]{clarities_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void fluoresence_add(Object requestEntity, String fluoresence_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-fluoresence/{0}", new Object[]{fluoresence_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void category_add(Object requestEntity, String catename) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-category/{0}", new Object[]{catename})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void clarities_delete(String clarities_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-clarities/{0}", new Object[]{clarities_id})).request().delete();
    }

    public void color_add(Object requestEntity, String color_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-color/{0}", new Object[]{color_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallcategory(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-category");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void fluoresence_delete(String fluoresence_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-fluoresence/{0}", new Object[]{fluoresence_id})).request().delete();
    }

    public void cut_add(Object requestEntity, String cut_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("add-cuts/{0}", new Object[]{cut_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getallfluoresence(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-fluoresence");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getallcolor(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("get-colors");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void fluoresence_update(Object requestEntity, String fluoresence_id, String fluoresence_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-fluoresence/{0}/{1}", new Object[]{fluoresence_id, fluoresence_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void category_delete(String cate_id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delete-category/{0}", new Object[]{cate_id})).request().delete();
    }

    public void color_update(Object requestEntity, String color__id, String color_name) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("update-color/{0}/{1}", new Object[]{color__id, color_name})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void close() {
        client.close();
    }
    
}
