/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package CDI;

import client.DiamondClientRest;
import entity.Claritiestb;
import entity.Colortb;
import entity.Companiestb;
import entity.Cutstb;
import entity.Diamondstb;
import entity.Fluoresencestb;
import entity.Polishestb;
import entity.Shapetb;
import entity.Symmetriestb;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@Named(value = "cDIbeanDiamond")
@RequestScoped
public class CDIbeanDiamond {

//   client
    DiamondClientRest diamondClientRest;
//    response
    Response response;
//    Diamond table
    Diamondstb diamondstb;
    Diamondstb d = new Diamondstb();
    GenericType<List<Diamondstb>> genericTypeDiamond;
    List<Diamondstb> diamondstbs;
//    Cuts Table
    Cutstb cutstb;
    Cutstb c = new Cutstb();
    GenericType<List<Cutstb>> genericTypeCuts;
    List<Cutstb> cutstbs;
//    compnay table
    Companiestb companiestb;
    Companiestb com = new Companiestb();
    GenericType<List<Companiestb>> genericTypeCompnai;
    List<Companiestb> companiestbs;
//    colour table
    Colortb colortb;
    Colortb color = new Colortb();
    GenericType<List<Colortb>> genericTypeColore;
    List<Colortb> colortbs;
//    polish
    Polishestb polishestb;
    Polishestb p = new Polishestb();
    GenericType<List<Polishestb>> genericTypePolish;
    List<Polishestb> polishestbs;
//    for="clarityId" 
    Claritiestb claritiestb;
    Claritiestb claritie = new Claritiestb();
    GenericType<List<Claritiestb>> genericTypeClarities;
    List<Claritiestb> claritiestbs;
//Shapes
    Shapetb shapetb;
    Shapetb shape = new Shapetb();
    GenericType<List<Shapetb>> genericTypeShape;
    List<Shapetb> shapetbs;
//    symmetryId
    Symmetriestb symmetriestb;
    Symmetriestb symmetries = new Symmetriestb();
    GenericType<List<Symmetriestb>> genericTypeSymmetries;
    List<Symmetriestb> symmetriestbs;

//    fluorescenceId
    Fluoresencestb fluoresencestb;
    Fluoresencestb fluoresences = new Fluoresencestb();
    GenericType<List<Fluoresencestb>> genericTypefluorescence;
    List<Fluoresencestb> fluoresencestbs;

//    diamond list getter setter
    public Diamondstb getD() {
        return d;
    }

    public void setD(Diamondstb d) {
        this.d = d;
    }

    public List<Diamondstb> getDiamondstbs() {
        response = diamondClientRest.getalldiamonds(Response.class);
        diamondstbs = response.readEntity(genericTypeDiamond);
        return diamondstbs;
    }

    public void setDiamondstbs(List<Diamondstb> diamondstbs) {
        this.diamondstbs = diamondstbs;
    }
//    cust table getter setter

    public Cutstb getC() {
        return c;
    }

    public void setC(Cutstb c) {
        this.c = c;
    }

    public List<Cutstb> getCutstbs() {
        response = diamondClientRest.getallcuts(Response.class);
        cutstbs = response.readEntity(genericTypeCuts);
        System.err.println("----------------cdi bean--------" + cutstbs + "-----idd----" + cuts_id);
        return cutstbs;
    }

    public void setCutstbs(List<Cutstb> cutstbs) {
        this.cutstbs = cutstbs;
    }

    public Companiestb getCom() {
        return com;
    }

    public void setCom(Companiestb com) {
        this.com = com;
    }

    public List<Companiestb> getCompaniestbs() {
        response = diamondClientRest.getallcompnay(Response.class);
        companiestbs = response.readEntity(genericTypeCompnai);
        System.err.println("----------------cdi bean--------" + companiestbs + "-----idd----" + compnay_id);
        return companiestbs;
    }

    public void setCompaniestbs(List<Companiestb> companiestbs) {
        this.companiestbs = companiestbs;
    }

    public Colortb getColor() {
        return color;
    }

    public void setColor(Colortb color) {
        this.color = color;
    }

    public List<Colortb> getColortbs() {
        response = diamondClientRest.getallcolor(Response.class);
        colortbs = response.readEntity(genericTypeColore);
        System.err.println("----------------cdi bean--------" + colortbs + "-----idd----" + colour_id);
        return colortbs;
    }

    public void setColortbs(List<Colortb> colortbs) {

        this.colortbs = colortbs;
    }

    public Polishestb getPolishestb() {
        return polishestb;
    }

    public void setPolishestb(Polishestb polishestb) {
        this.polishestb = polishestb;
    }

    public List<Polishestb> getPolishestbs() {
        response = diamondClientRest.getallpolishe(Response.class);
        polishestbs = response.readEntity(genericTypePolish);
        System.err.println("----------------cdi bean--------" + polishestbs + "-----idd----");
        return polishestbs;
    }

    public void setPolishestbs(List<Polishestb> polishestbs) {
        this.polishestbs = polishestbs;
    }

    public Claritiestb getClaritie() {
        return claritie;
    }

    public void setClaritie(Claritiestb claritie) {
        this.claritie = claritie;
    }

    public List<Claritiestb> getClaritiestbs() {
        response = diamondClientRest.getallclarities(Response.class);
        claritiestbs = response.readEntity(genericTypeClarities);
        System.err.println("----------------cdi bean--------" + claritiestbs + "-----idd----");
        return claritiestbs;
    }

    public void setClaritiestbs(List<Claritiestb> claritiestbs) {
        this.claritiestbs = claritiestbs;
    }

    public Shapetb getShape() {
        return shape;
    }

    public void setShape(Shapetb shape) {
        this.shape = shape;
    }

    public List<Shapetb> getShapetbs() {
        response = diamondClientRest.getallshape(Response.class);
        shapetbs = response.readEntity(genericTypeShape);
        System.err.println("----------------cdi bean--------" + shapetbs);
        return shapetbs;
    }

    public void setShapetbs(List<Shapetb> shapetbs) {
        this.shapetbs = shapetbs;
    }

    public Symmetriestb getSymmetries() {
        return symmetries;
    }

    public void setSymmetries(Symmetriestb symmetries) {
        this.symmetries = symmetries;
    }

    public List<Symmetriestb> getSymmetriestbs() {
        response = diamondClientRest.getallsynmetries(Response.class);
        symmetriestbs = response.readEntity(genericTypeSymmetries);
        System.err.println("----------------cdi bean--------" + symmetriestbs);
        return symmetriestbs;
    }

    public void setSymmetriestbs(List<Symmetriestb> symmetriestbs) {
        this.symmetriestbs = symmetriestbs;
    }

    public Fluoresencestb getFluoresences() {
        return fluoresences;
    }

    public void setFluoresences(Fluoresencestb fluoresences) {
        this.fluoresences = fluoresences;
    }

    public List<Fluoresencestb> getFluoresencestbs() {
        response = diamondClientRest.getallfluoresence(Response.class);
        fluoresencestbs = response.readEntity(genericTypefluorescence);
        System.err.println("----------------cdi bean--------" + fluoresencestbs);
        return fluoresencestbs;
    }

    public void setFluoresencestbs(List<Fluoresencestb> fluoresencestbs) {
        this.fluoresencestbs = fluoresencestbs;
    }

//    -----------------------------------------------------------
//    diamond table getter setter
    int userid, cuts_id, compnay_id, colour_id, polish_id, clarities_id, shape_id, symmetry_id, fluorescence_Id;
    String certificate, measurements, image;
    float weigth, price;
    boolean avability;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCuts_id() {
        return cuts_id;
    }

    public void setCuts_id(int cuts_id) {
        this.cuts_id = cuts_id;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvability() {
        return avability;
    }

    public void setAvability(boolean avability) {
        this.avability = avability;
    }

    public int getCompnay_id() {
        return compnay_id;
    }

    public void setCompnay_id(int compnay_id) {
        this.compnay_id = compnay_id;
    }

    public int getColour_id() {
        return colour_id;
    }

    public void setColour_id(int colour_id) {
        this.colour_id = colour_id;
    }

    public int getPolish_id() {
        return polish_id;
    }

    public void setPolish_id(int polish_id) {
        this.polish_id = polish_id;
    }

    public int getClarities_id() {
        return clarities_id;
    }

    public void setClarities_id(int clarities_id) {
        this.clarities_id = clarities_id;
    }

    public int getShape_id() {
        return shape_id;
    }

    public void setShape_id(int shape_id) {
        this.shape_id = shape_id;
    }

    public int getSymmetry_id() {
        return symmetry_id;
    }

    public void setSymmetry_id(int symmetry_id) {
        this.symmetry_id = symmetry_id;
    }

    public int getFluorescence_Id() {
        return fluorescence_Id;
    }

    public void setFluorescence_Id(int fluorescence_Id) {
        this.fluorescence_Id = fluorescence_Id;
    }

//    --------------------------
    public CDIbeanDiamond() {

        diamondClientRest = new DiamondClientRest();
//        diamond
        diamondstb = new Diamondstb();
        genericTypeDiamond = new GenericType<List<Diamondstb>>() {
        };
        diamondstbs = new ArrayList<Diamondstb>();
//        cuts
        cutstb = new Cutstb();
        genericTypeCuts = new GenericType<List<Cutstb>>() {
        };
        cutstbs = new ArrayList<Cutstb>();

//        company
        companiestb = new Companiestb();
        genericTypeCompnai = new GenericType<List<Companiestb>>() {
        };
        companiestbs = new ArrayList<Companiestb>();
//coloure
        colortb = new Colortb();
        genericTypeColore = new GenericType<List<Colortb>>() {
        };
        colortbs = new ArrayList<Colortb>();
//poliish
        polishestb = new Polishestb();
        genericTypePolish = new GenericType<List<Polishestb>>() {
        };
        polishestbs = new ArrayList<Polishestb>();
//        clarities
        claritie = new Claritiestb();
        genericTypeClarities = new GenericType<List<Claritiestb>>() {
        };
        claritiestbs = new ArrayList<Claritiestb>();
        //        Shape
        shapetb = new Shapetb();
        genericTypeShape = new GenericType<List<Shapetb>>() {
        };
        shapetbs = new ArrayList<Shapetb>();

//        symmetryId
        symmetriestb = new Symmetriestb();
        genericTypeSymmetries = new GenericType<List<Symmetriestb>>() {
        };
        symmetriestbs = new ArrayList<Symmetriestb>();

//fluorescenceId
        fluoresencestb = new Fluoresencestb();
        genericTypefluorescence = new GenericType<List<Fluoresencestb>>() {
        };
        fluoresencestbs = new ArrayList<Fluoresencestb>();

    }

    public String diamond_insert() {
        System.err.println("----------Navigate- diamon insert------------" + cuts_id + userid + weigth + price + certificate + measurements + image);
        System.err.println("----------Navigate- diamon compnay------------" + compnay_id + "-----------colortb-------" + colour_id);
        System.err.println("----------Navigate- diamon polish------------" + polish_id + "-----------claritie-------" + clarities_id);
        System.err.println("----------Navigate- diamon shape-----------" + shape_id);
        System.err.println("----------Navigate- diamon flur-----------" + fluorescence_Id + "---symmid-" + symmetry_id);
        diamondClientRest.diamond_add2(String.valueOf(userid), String.valueOf(compnay_id), String.valueOf(shape_id), String.valueOf(colour_id), String.valueOf(clarities_id), String.valueOf(cuts_id), String.valueOf(polish_id), String.valueOf(fluorescence_Id), String.valueOf(symmetry_id),
                String.valueOf(weigth), String.valueOf(price), String.valueOf(avability), certificate, measurements);
        System.err.println("----------Navigate- diamon insert- 2-----------" + cuts_id + userid + weigth + price + certificate + measurements + image);

//             void insert_diamonds2(Integer userId, Integer compayId, Integer shapeId, Integer colourId, Integer clarityId, 
//Integer cutsId, Integer polishId, Integer fluorescenceId, Integer symmetryId, Float weigth, Float price,
//Boolean availability,String certificate,String measurements);
        return "Error_404_Page.jsf";
    }
}
