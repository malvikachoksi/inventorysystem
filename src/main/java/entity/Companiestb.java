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
@Table(name = "companiestb")
@NamedQueries({
    @NamedQuery(name = "Companiestb.findAll", query = "SELECT c FROM Companiestb c"),
    @NamedQuery(name = "Companiestb.findByCompnayId", query = "SELECT c FROM Companiestb c WHERE c.compnayId = :compnayId"),
    @NamedQuery(name = "Companiestb.findByStateId", query = "SELECT c FROM Companiestb c WHERE c.stateId = :stateId"),
    @NamedQuery(name = "Companiestb.findByCityId", query = "SELECT c FROM Companiestb c WHERE c.cityId = :cityId")})
public class Companiestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compnay_id")
    private Integer compnayId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "compnay_name")
    private String compnayName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state_id")
    private int stateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "city_id")
    private int cityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compnayId")
    @JsonbTransient
    private Collection<Diamondstb> diamondstbCollection;

    public Companiestb() {
    }

    public Companiestb(Integer compnayId) {
        this.compnayId = compnayId;
    }

    public Companiestb(Integer compnayId, String compnayName, int stateId, int cityId) {
        this.compnayId = compnayId;
        this.compnayName = compnayName;
        this.stateId = stateId;
        this.cityId = cityId;
    }

    public Integer getCompnayId() {
        return compnayId;
    }

    public void setCompnayId(Integer compnayId) {
        this.compnayId = compnayId;
    }

    public String getCompnayName() {
        return compnayName;
    }

    public void setCompnayName(String compnayName) {
        this.compnayName = compnayName;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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
        hash += (compnayId != null ? compnayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Companiestb)) {
            return false;
        }
        Companiestb other = (Companiestb) object;
        if ((this.compnayId == null && other.compnayId != null) || (this.compnayId != null && !this.compnayId.equals(other.compnayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Companiestb[ compnayId=" + compnayId + " ]";
    }
    
}
