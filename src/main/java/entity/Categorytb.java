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

@Entity
@Table(name = "categorytb")
@NamedQueries({
    @NamedQuery(name = "Categorytb.findAll", query = "SELECT c FROM Categorytb c"),
    @NamedQuery(name = "Categorytb.findByCateId", query = "SELECT c FROM Categorytb c WHERE c.cateId = :cateId")})
public class Categorytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cate_id")
    private Integer cateId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "cate_name")
    private String cateName;

    public Categorytb() {
    }

    public Categorytb(Integer cateId) {
        this.cateId = cateId;
    }

    public Categorytb(Integer cateId, String cateName) {
        this.cateId = cateId;
        this.cateName = cateName;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cateId != null ? cateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorytb)) {
            return false;
        }
        Categorytb other = (Categorytb) object;
        if ((this.cateId == null && other.cateId != null) || (this.cateId != null && !this.cateId.equals(other.cateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Categorytb[ cateId=" + cateId + " ]";
    }
    
}
