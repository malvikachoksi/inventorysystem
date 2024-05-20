/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "diamondstb")
@NamedQueries({
    @NamedQuery(name = "Diamondstb.findAll", query = "SELECT d FROM Diamondstb d"),
    @NamedQuery(name = "Diamondstb.findByDiamondId", query = "SELECT d FROM Diamondstb d WHERE d.diamondId = :diamondId"),
    @NamedQuery(name = "Diamondstb.findByUserId", query = "SELECT d FROM Diamondstb d WHERE d.userId = :userId"),
    @NamedQuery(name = "Diamondstb.findByWeigth", query = "SELECT d FROM Diamondstb d WHERE d.weigth = :weigth"),
    @NamedQuery(name = "Diamondstb.findByPrice", query = "SELECT d FROM Diamondstb d WHERE d.price = :price"),
    @NamedQuery(name = "Diamondstb.findByAvailability", query = "SELECT d FROM Diamondstb d WHERE d.availability = :availability")})
public class Diamondstb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "diamond_id")
    private Integer diamondId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Lob
    @Size(max = 65535)
    @Column(name = "certificate")
    private String certificate;
    @Lob
    @Size(max = 65535)
    @Column(name = "measurements")
    private String measurements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weigth")
    private float weigth;
    @Lob
    @Size(max = 65535)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "availability")
    private boolean availability;
    @JoinColumn(name = "compnay_id", referencedColumnName = "compnay_id")
    @ManyToOne(optional = false)
    private Companiestb compnayId;
    @JoinColumn(name = "colour_id", referencedColumnName = "color_id")
    @ManyToOne(optional = false)
    private Colortb colourId;
    @JoinColumn(name = "polish_id", referencedColumnName = "polishe_id")
    @ManyToOne(optional = false)
    private Polishestb polishId;
    @JoinColumn(name = "clarity_id", referencedColumnName = "clarities_id")
    @ManyToOne(optional = false)
    private Claritiestb clarityId;
    @JoinColumn(name = "shape_id", referencedColumnName = "shape_id")
    @ManyToOne(optional = false)
    private Shapetb shapeId;
    @JoinColumn(name = "cut_id", referencedColumnName = "cut_id")
    @ManyToOne(optional = false)
    private Cutstb cutId;
    @JoinColumn(name = "fluorescence_id", referencedColumnName = "fluoresence_id")
    @ManyToOne(optional = false)
    private Fluoresencestb fluorescenceId;
    @JoinColumn(name = "symmetry_id", referencedColumnName = "symmetrie_id")
    @ManyToOne(optional = false)
    private Symmetriestb symmetryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diamonadId")
    private Collection<Transactiontb> transactiontbCollection;

    public Diamondstb() {
    }

    public Diamondstb(Integer diamondId) {
        this.diamondId = diamondId;
    }

    public Diamondstb(Integer diamondId, int userId, float weigth, float price, boolean availability) {
        this.diamondId = diamondId;
        this.userId = userId;
        this.weigth = weigth;
        this.price = price;
        this.availability = availability;
    }

    public Integer getDiamondId() {
        return diamondId;
    }

    public void setDiamondId(Integer diamondId) {
        this.diamondId = diamondId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Companiestb getCompnayId() {
        return compnayId;
    }

    public void setCompnayId(Companiestb compnayId) {
        this.compnayId = compnayId;
    }

    public Colortb getColourId() {
        return colourId;
    }

    public void setColourId(Colortb colourId) {
        this.colourId = colourId;
    }

    public Polishestb getPolishId() {
        return polishId;
    }

    public void setPolishId(Polishestb polishId) {
        this.polishId = polishId;
    }

    public Claritiestb getClarityId() {
        return clarityId;
    }

    public void setClarityId(Claritiestb clarityId) {
        this.clarityId = clarityId;
    }

    public Shapetb getShapeId() {
        return shapeId;
    }

    public void setShapeId(Shapetb shapeId) {
        this.shapeId = shapeId;
    }

    public Cutstb getCutId() {
        return cutId;
    }

    public void setCutId(Cutstb cutId) {
        this.cutId = cutId;
    }

    public Fluoresencestb getFluorescenceId() {
        return fluorescenceId;
    }

    public void setFluorescenceId(Fluoresencestb fluorescenceId) {
        this.fluorescenceId = fluorescenceId;
    }

    public Symmetriestb getSymmetryId() {
        return symmetryId;
    }

    public void setSymmetryId(Symmetriestb symmetryId) {
        this.symmetryId = symmetryId;
    }

    public Collection<Transactiontb> getTransactiontbCollection() {
        return transactiontbCollection;
    }

    public void setTransactiontbCollection(Collection<Transactiontb> transactiontbCollection) {
        this.transactiontbCollection = transactiontbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diamondId != null ? diamondId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diamondstb)) {
            return false;
        }
        Diamondstb other = (Diamondstb) object;
        if ((this.diamondId == null && other.diamondId != null) || (this.diamondId != null && !this.diamondId.equals(other.diamondId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Diamondstb[ diamondId=" + diamondId + " ]";
    }
    
}
