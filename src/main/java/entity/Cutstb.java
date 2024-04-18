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
@Table(name = "cutstb")
@NamedQueries({
    @NamedQuery(name = "Cutstb.findAll", query = "SELECT c FROM Cutstb c"),
    @NamedQuery(name = "Cutstb.findByCutId", query = "SELECT c FROM Cutstb c WHERE c.cutId = :cutId")})
public class Cutstb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cut_id")
    private Integer cutId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "cut_name")
    private String cutName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cutId")
    private Collection<Diamondstb> diamondstbCollection;

    public Cutstb() {
    }

    public Cutstb(Integer cutId) {
        this.cutId = cutId;
    }

    public Cutstb(Integer cutId, String cutName) {
        this.cutId = cutId;
        this.cutName = cutName;
    }

    public Integer getCutId() {
        return cutId;
    }

    public void setCutId(Integer cutId) {
        this.cutId = cutId;
    }

    public String getCutName() {
        return cutName;
    }

    public void setCutName(String cutName) {
        this.cutName = cutName;
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
        hash += (cutId != null ? cutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cutstb)) {
            return false;
        }
        Cutstb other = (Cutstb) object;
        if ((this.cutId == null && other.cutId != null) || (this.cutId != null && !this.cutId.equals(other.cutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cutstb[ cutId=" + cutId + " ]";
    }
    
}
