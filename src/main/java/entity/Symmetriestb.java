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
@Table(name = "symmetriestb")
@NamedQueries({
    @NamedQuery(name = "Symmetriestb.findAll", query = "SELECT s FROM Symmetriestb s"),
    @NamedQuery(name = "Symmetriestb.findBySymmetrieId", query = "SELECT s FROM Symmetriestb s WHERE s.symmetrieId = :symmetrieId")})
public class Symmetriestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "symmetrie_id")
    private Integer symmetrieId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "symmetrie_name")
    private String symmetrieName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "symmetryId")
    private Collection<Diamondstb> diamondstbCollection;

    public Symmetriestb() {
    }

    public Symmetriestb(Integer symmetrieId) {
        this.symmetrieId = symmetrieId;
    }

    public Symmetriestb(Integer symmetrieId, String symmetrieName) {
        this.symmetrieId = symmetrieId;
        this.symmetrieName = symmetrieName;
    }

    public Integer getSymmetrieId() {
        return symmetrieId;
    }

    public void setSymmetrieId(Integer symmetrieId) {
        this.symmetrieId = symmetrieId;
    }

    public String getSymmetrieName() {
        return symmetrieName;
    }

    public void setSymmetrieName(String symmetrieName) {
        this.symmetrieName = symmetrieName;
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
        hash += (symmetrieId != null ? symmetrieId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Symmetriestb)) {
            return false;
        }
        Symmetriestb other = (Symmetriestb) object;
        if ((this.symmetrieId == null && other.symmetrieId != null) || (this.symmetrieId != null && !this.symmetrieId.equals(other.symmetrieId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Symmetriestb[ symmetrieId=" + symmetrieId + " ]";
    }
    
}
