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

@Named(value = "diamondCDIBean")
@RequestScoped
public class DiamondCDIBean {

    DiamondClientRest diamondClientRest;
    Response response;

    Diamondstb diamondstb;
    Diamondstb d = new Diamondstb();
    List<Diamondstb> diamondstbs;
    GenericType<List<Diamondstb>> genericTypeDiamond;

    public Diamondstb getDiamondstb() {
        return diamondstb;
    }

    public void setDiamondstb(Diamondstb diamondstb) {
        this.diamondstb = diamondstb;
    }

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

    Colortb colortb;
    Colortb c = new Colortb();
    List<Colortb> colortbs;
    GenericType<List<Colortb>> genericTypeColor;

    public Colortb getColortb() {
        return colortb;
    }

    public void setColortb(Colortb colortb) {
        this.colortb = colortb;
    }

    public Colortb getC() {
        return c;
    }

    public void setC(Colortb c) {
        this.c = c;
    }

    public List<Colortb> getColortbs() {
        response = diamondClientRest.getallcolor(Response.class);
        colortbs = response.readEntity(genericTypeColor);
        return colortbs;
    }

    public void setColortbs(List<Colortb> colortbs) {
        this.colortbs = colortbs;
    }

    Polishestb polishestb;
    Polishestb p = new Polishestb();
    List<Polishestb> polishestbs;
    GenericType<List<Polishestb>> genericTypePolish;

    public Polishestb getPolishestb() {
        return polishestb;
    }

    public void setPolishestb(Polishestb polishestb) {
        this.polishestb = polishestb;
    }

    public Polishestb getP() {
        return p;
    }

    public void setP(Polishestb p) {
        this.p = p;
    }

    public List<Polishestb> getPolishestbs() {
        response = diamondClientRest.getallpolishe(Response.class);
        polishestbs = response.readEntity(genericTypePolish);
        return polishestbs;
    }

    public void setPolishestbs(List<Polishestb> polishestbs) {
        this.polishestbs = polishestbs;
    }
//---------getter setter of the id------------    
    int compnay_id, shape_id, colour_id, clarity_id, cut_id, polish_id, fluorescence_id, symmetry_id;

    public int getCompnay_id() {
        return compnay_id;
    }

    public void setCompnay_id(int compnay_id) {
        this.compnay_id = compnay_id;
    }

    public int getShape_id() {
        return shape_id;
    }

    public void setShape_id(int shape_id) {
        this.shape_id = shape_id;
    }

    public int getColour_id() {
        return colour_id;
    }

    public void setColour_id(int colour_id) {
        this.colour_id = colour_id;
    }

    public int getClarity_id() {
        return clarity_id;
    }

    public void setClarity_id(int clarity_id) {
        this.clarity_id = clarity_id;
    }

    public int getCut_id() {
        return cut_id;
    }

    public void setCut_id(int cut_id) {
        this.cut_id = cut_id;
    }

    public int getPolish_id() {
        return polish_id;
    }

    public void setPolish_id(int polish_id) {
        this.polish_id = polish_id;
    }

    public int getFluorescence_id() {
        return fluorescence_id;
    }

    public void setFluorescence_id(int fluorescence_id) {
        this.fluorescence_id = fluorescence_id;
    }

    public int getSymmetry_id() {
        return symmetry_id;
    }

    public void setSymmetry_id(int symmetry_id) {
        this.symmetry_id = symmetry_id;
    }

//    -----------------List in DropDown-----------
    Claritiestb claritiestb;
    Claritiestb claritiestb1 = new Claritiestb();
    List<Claritiestb> claritiestbs;
    GenericType<List<Claritiestb>> genericTypeClarities;

    public Claritiestb getClaritiestb() {
        return claritiestb;
    }

    public void setClaritiestb(Claritiestb claritiestb) {
        this.claritiestb = claritiestb;
    }

    public Claritiestb getClaritiestb1() {
        return claritiestb1;
    }

    public void setClaritiestb1(Claritiestb claritiestb1) {
        this.claritiestb1 = claritiestb1;
    }

    public List<Claritiestb> getClaritiestbs() {
        response = diamondClientRest.getallclarities(Response.class);
        claritiestbs = response.readEntity(genericTypeClarities);
        return claritiestbs;
    }

    public void setClaritiestbs(List<Claritiestb> claritiestbs) {
        this.claritiestbs = claritiestbs;
    }
//    ------------------Shape---------------------

    Shapetb shapetb;
    Shapetb shape = new Shapetb();
    List<Shapetb> shapetbs;
    GenericType<List<Shapetb>> genericTypeShape;

    public Shapetb getShapetb() {
        return shapetb;
    }

    public void setShapetb(Shapetb shapetb) {
        this.shapetb = shapetb;
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
        return shapetbs;
    }

    public void setShapetbs(List<Shapetb> shapetbs) {
        this.shapetbs = shapetbs;
    }
//-------------------------------cuts-----------------------
    Cutstb cutstb;
    List<Cutstb> cutstbs;
    GenericType<List<Cutstb>> genericTypeCuts;

    public Cutstb getCutstb() {
        return cutstb;
    }

    public void setCutstb(Cutstb cutstb) {
        this.cutstb = cutstb;
    }

    public List<Cutstb> getCutstbs() {
        response = diamondClientRest.getallcuts(Response.class);
        cutstbs = response.readEntity(genericTypeCuts);
        return cutstbs;
    }

    public void setCutstbs(List<Cutstb> cutstbs) {
        this.cutstbs = cutstbs;
    }
//    ------------------fluorescenceId-------------
    Fluoresencestb fluoresencestb;
    List<Fluoresencestb> fluoresencestbs;
    GenericType<List<Fluoresencestb>> genericTypefluoresences;

    public Fluoresencestb getFluoresencestb() {
        return fluoresencestb;
    }

    public void setFluoresencestb(Fluoresencestb fluoresencestb) {
        this.fluoresencestb = fluoresencestb;
    }

    public List<Fluoresencestb> getFluoresencestbs() {
        response = diamondClientRest.getallfluoresence(Response.class);
        fluoresencestbs = response.readEntity(genericTypefluoresences);
        return fluoresencestbs;
    }

    public void setFluoresencestbs(List<Fluoresencestb> fluoresencestbs) {
        this.fluoresencestbs = fluoresencestbs;
    }

//    ------------------------------symmetriestb----------------------------------
    Symmetriestb symmetriestb;
    List<Symmetriestb> symmetriestbs;
    GenericType<List<Symmetriestb>> genericTypesymmetries;

    public Symmetriestb getSymmetriestb() {
        return symmetriestb;
    }

    public void setSymmetriestb(Symmetriestb symmetriestb) {
        this.symmetriestb = symmetriestb;
    }

    public List<Symmetriestb> getSymmetriestbs() {
        response = diamondClientRest.getallsynmetries(Response.class);
        symmetriestbs = response.readEntity(genericTypesymmetries);
        return symmetriestbs;
    }

    public void setSymmetriestbs(List<Symmetriestb> symmetriestbs) {
        this.symmetriestbs = symmetriestbs;
    }
//------------compnay--------------
    Companiestb companiestb;
    List<Companiestb> companiestbs;
    GenericType<List<Companiestb>> genericTypeCompanies;

    public Companiestb getCompaniestb() {
        return companiestb;
    }

    public void setCompaniestb(Companiestb companiestb) {
        this.companiestb = companiestb;
    }

    public List<Companiestb> getCompaniestbs() {
        System.err.println("Compmay list call dropdwon------------");
        response = diamondClientRest.getallcompnay(Response.class);
        companiestbs = response.readEntity(genericTypeCompanies);
        return companiestbs;
    }

    public void setCompaniestbs(List<Companiestb> companiestbs) {
        this.companiestbs = companiestbs;
    }

//    ----------------------------------------------------
    public DiamondCDIBean() {

        diamondClientRest = new DiamondClientRest();
//diamond
        diamondstb = new Diamondstb();
        diamondstbs = new ArrayList<>();
        genericTypeDiamond = new GenericType<List<Diamondstb>>() {
        };
//colour
        colortb = new Colortb();
        colortbs = new ArrayList<>();
        genericTypeColor = new GenericType<List<Colortb>>() {
        };
//polish
        polishestb = new Polishestb();
        polishestbs = new ArrayList<>();
        genericTypePolish = new GenericType<List<Polishestb>>() {
        };
//        clarities
        claritiestb = new Claritiestb();
        claritiestbs = new ArrayList<>();
        genericTypeClarities = new GenericType<List<Claritiestb>>() {
        };
//shape
        shape = new Shapetb();
        shapetbs = new ArrayList<>();
        genericTypeShape = new GenericType<List<Shapetb>>() {
        };
//    cuts
        cutstb = new Cutstb();
        cutstbs = new ArrayList<>();
        genericTypeCuts = new GenericType<List<Cutstb>>() {
        };
//        fluorescenceId
        fluoresencestb = new Fluoresencestb();
        fluoresencestbs = new ArrayList<>();
        genericTypefluoresences = new GenericType<List<Fluoresencestb>>() {
        };
//        symmetries
        symmetriestb = new Symmetriestb();
        symmetriestbs = new ArrayList<>();
        genericTypesymmetries = new GenericType<List<Symmetriestb>>() {
        };
//        compnay
        companiestb = new Companiestb();
        companiestbs = new ArrayList<>();
        genericTypeCompanies = new GenericType<List<Companiestb>>() {
        };
    }

    public String niharDiamond() {
        System.err.println("---------CDi bean call diamond add------------");
//        diamondClientRest.diamond_add(String.valueOf(d.getUserId()), String.valueOf(d.getSymmetryId()),
//                String.valueOf(d.getWeigth()), String.valueOf(d.getPrice()), String.valueOf(d.getAvailability()));

//now here get all the id of the foriegn key to insert and create the drop down liist
  System.err.println("add -diamond 21 ------rest api user id -------" + d.getUserId());
        System.err.println("add -diamond 21 ------rest api compnay-------" +  shape_id);
        System.err.println("add -diamond 21 ------rest api clarity-------" +  colour_id);
        System.err.println("add -diamond 21 ------rest api cuts-------" + clarity_id);
        System.err.println("add -diamond 21 ------rest api polish-------" + polish_id);
        System.err.println("add -diamond 21 ------rest api fluorescenceId-------" + fluorescence_id);
        System.err.println("add -diamond 21 ------rest api symmetryId-------" + symmetry_id);
        System.err.println("add -diamond 21 ------rest api wiegth-------" + d.getWeigth());
        System.err.println("add -diamond 21 ------rest api shape-------" + shape_id);
        diamondClientRest.diamond_add2(String.valueOf(d.getUserId()),String.valueOf(compnay_id), String.valueOf(shape_id), String.valueOf(colour_id), 
                String.valueOf(clarity_id), String.valueOf(cut_id), String.valueOf(polish_id), String.valueOf(fluorescence_id), String.valueOf(symmetry_id), String.valueOf(d.getWeigth()), String.valueOf(d.getPrice()), String.valueOf(d.getAvailability()));
        return "Diamond_Display.xhtml";
    }

}
