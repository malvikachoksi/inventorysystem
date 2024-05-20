/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.json.bind.annotation.JsonbTransient;
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
@Table(name = "fluoresencestb")
@NamedQueries({
    @NamedQuery(name = "Fluoresencestb.findAll", query = "SELECT f FROM Fluoresencestb f"),
    @NamedQuery(name = "Fluoresencestb.findByFluoresenceId", query = "SELECT f FROM Fluoresencestb f WHERE f.fluoresenceId = :fluoresenceId")})
public class Fluoresencestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fluoresence_id")
    private Integer fluoresenceId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "fluoresence_name")
    private String fluoresenceName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fluorescenceId")
    @JsonbTransient
    private Collection<Diamondstb> diamondstbCollection;

    public Fluoresencestb() {
    }

    public Fluoresencestb(Integer fluoresenceId) {
        this.fluoresenceId = fluoresenceId;
    }

    public Fluoresencestb(Integer fluoresenceId, String fluoresenceName) {
        this.fluoresenceId = fluoresenceId;
        this.fluoresenceName = fluoresenceName;
    }

    public Integer getFluoresenceId() {
        return fluoresenceId;
    }

    public void setFluoresenceId(Integer fluoresenceId) {
        this.fluoresenceId = fluoresenceId;
    }

    public String getFluoresenceName() {
        return fluoresenceName;
    }

    public void setFluoresenceName(String fluoresenceName) {
        this.fluoresenceName = fluoresenceName;
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
        hash += (fluoresenceId != null ? fluoresenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fluoresencestb)) {
            return false;
        }
        Fluoresencestb other = (Fluoresencestb) object;
        if ((this.fluoresenceId == null && other.fluoresenceId != null) || (this.fluoresenceId != null && !this.fluoresenceId.equals(other.fluoresenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Fluoresencestb[ fluoresenceId=" + fluoresenceId + " ]";
    }
    
}
