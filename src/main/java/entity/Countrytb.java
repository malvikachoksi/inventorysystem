/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "countrytb")
@NamedQueries({
    @NamedQuery(name = "Countrytb.findAll", query = "SELECT c FROM Countrytb c"),
    @NamedQuery(name = "Countrytb.findByCountryId", query = "SELECT c FROM Countrytb c WHERE c.countryId = :countryId"),
    @NamedQuery(name = "Countrytb.findByCityId", query = "SELECT c FROM Countrytb c WHERE c.cityId = :cityId"),
    @NamedQuery(name = "Countrytb.findByStateId", query = "SELECT c FROM Countrytb c WHERE c.stateId = :stateId")})
public class Countrytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "city_id")
    private int cityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state_id")
    private int stateId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "country_name")
    private String countryName;

    public Countrytb() {
    }

    public Countrytb(Integer countryId) {
        this.countryId = countryId;
    }

    public Countrytb(Integer countryId, int cityId, int stateId, String countryName) {
        this.countryId = countryId;
        this.cityId = cityId;
        this.stateId = stateId;
        this.countryName = countryName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countrytb)) {
            return false;
        }
        Countrytb other = (Countrytb) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Countrytb[ countryId=" + countryId + " ]";
    }
    
}
