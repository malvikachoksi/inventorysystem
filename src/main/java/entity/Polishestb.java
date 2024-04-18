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
@Table(name = "polishestb")
@NamedQueries({
    @NamedQuery(name = "Polishestb.findAll", query = "SELECT p FROM Polishestb p"),
    @NamedQuery(name = "Polishestb.findByPolisheId", query = "SELECT p FROM Polishestb p WHERE p.polisheId = :polisheId")})
public class Polishestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "polishe_id")
    private Integer polisheId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "polishe_name")
    private String polisheName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polishId")
    private Collection<Diamondstb> diamondstbCollection;

    public Polishestb() {
    }

    public Polishestb(Integer polisheId) {
        this.polisheId = polisheId;
    }

    public Polishestb(Integer polisheId, String polisheName) {
        this.polisheId = polisheId;
        this.polisheName = polisheName;
    }

    public Integer getPolisheId() {
        return polisheId;
    }

    public void setPolisheId(Integer polisheId) {
        this.polisheId = polisheId;
    }

    public String getPolisheName() {
        return polisheName;
    }

    public void setPolisheName(String polisheName) {
        this.polisheName = polisheName;
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
        hash += (polisheId != null ? polisheId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polishestb)) {
            return false;
        }
        Polishestb other = (Polishestb) object;
        if ((this.polisheId == null && other.polisheId != null) || (this.polisheId != null && !this.polisheId.equals(other.polisheId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Polishestb[ polisheId=" + polisheId + " ]";
    }
    
}
