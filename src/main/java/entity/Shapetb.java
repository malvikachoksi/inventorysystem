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
import javax.persistence.Lob;
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
@Table(name = "shapetb")
@NamedQueries({
    @NamedQuery(name = "Shapetb.findAll", query = "SELECT s FROM Shapetb s"),
    @NamedQuery(name = "Shapetb.findByShapeId", query = "SELECT s FROM Shapetb s WHERE s.shapeId = :shapeId")})
public class Shapetb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shape_id")
    private Integer shapeId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "shape_name")
    private String shapeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shapeId")
    private Collection<Diamondstb> diamondstbCollection;

    public Shapetb() {
    }

    public Shapetb(Integer shapeId) {
        this.shapeId = shapeId;
    }

    public Shapetb(Integer shapeId, String shapeName) {
        this.shapeId = shapeId;
        this.shapeName = shapeName;
    }

    public Integer getShapeId() {
        return shapeId;
    }

    public void setShapeId(Integer shapeId) {
        this.shapeId = shapeId;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public Collection<Diamondstb> getDiamondstbCollection() {
        return diamondstbCollection;
    }

    public void setDiamondstbCollection(Collection<Diamondstb> diamondstbCollection) {
        this.diamondstbCollection = diamondstbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shapeId != null ? shapeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shapetb)) {
            return false;
        }
        Shapetb other = (Shapetb) object;
        if ((this.shapeId == null && other.shapeId != null) || (this.shapeId != null && !this.shapeId.equals(other.shapeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Shapetb[ shapeId=" + shapeId + " ]";
    }
    
}
