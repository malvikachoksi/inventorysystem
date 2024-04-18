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
@Table(name = "colortb")
@NamedQueries({
    @NamedQuery(name = "Colortb.findAll", query = "SELECT c FROM Colortb c"),
    @NamedQuery(name = "Colortb.findByColorId", query = "SELECT c FROM Colortb c WHERE c.colorId = :colorId")})
public class Colortb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "color_id")
    private Integer colorId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "color_name")
    private String colorName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colourId")
    private Collection<Diamondstb> diamondstbCollection;

    public Colortb() {
    }

    public Colortb(Integer colorId) {
        this.colorId = colorId;
    }

    public Colortb(Integer colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
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
        hash += (colorId != null ? colorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colortb)) {
            return false;
        }
        Colortb other = (Colortb) object;
        if ((this.colorId == null && other.colorId != null) || (this.colorId != null && !this.colorId.equals(other.colorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Colortb[ colorId=" + colorId + " ]";
    }
    
}
