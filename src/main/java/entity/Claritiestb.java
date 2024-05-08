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
 * @author hp
 */
@Entity
@Table(name = "claritiestb")
@NamedQueries({
    @NamedQuery(name = "Claritiestb.findAll", query = "SELECT c FROM Claritiestb c"),
    @NamedQuery(name = "Claritiestb.findByClaritiesId", query = "SELECT c FROM Claritiestb c WHERE c.claritiesId = :claritiesId")})
public class Claritiestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clarities_id")
    private Integer claritiesId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "clarities_name")
    private String claritiesName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clarityId")
    private Collection<Diamondstb> diamondstbCollection;

    public Claritiestb() {
    }

    public Claritiestb(Integer claritiesId) {
        this.claritiesId = claritiesId;
    }

    public Claritiestb(Integer claritiesId, String claritiesName) {
        this.claritiesId = claritiesId;
        this.claritiesName = claritiesName;
    }

    public Integer getClaritiesId() {
        return claritiesId;
    }

    public void setClaritiesId(Integer claritiesId) {
        this.claritiesId = claritiesId;
    }

    public String getClaritiesName() {
        return claritiesName;
    }

    public void setClaritiesName(String claritiesName) {
        this.claritiesName = claritiesName;
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
        hash += (claritiesId != null ? claritiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Claritiestb)) {
            return false;
        }
        Claritiestb other = (Claritiestb) object;
        if ((this.claritiesId == null && other.claritiesId != null) || (this.claritiesId != null && !this.claritiesId.equals(other.claritiesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Claritiestb[ claritiesId=" + claritiesId + " ]";
    }
    
}
