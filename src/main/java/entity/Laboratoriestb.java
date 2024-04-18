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
@Table(name = "laboratoriestb")
@NamedQueries({
    @NamedQuery(name = "Laboratoriestb.findAll", query = "SELECT l FROM Laboratoriestb l"),
    @NamedQuery(name = "Laboratoriestb.findByLaboratoriesId", query = "SELECT l FROM Laboratoriestb l WHERE l.laboratoriesId = :laboratoriesId")})
public class Laboratoriestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "laboratories_id")
    private Integer laboratoriesId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "laboratories_name")
    private String laboratoriesName;

    public Laboratoriestb() {
    }

    public Laboratoriestb(Integer laboratoriesId) {
        this.laboratoriesId = laboratoriesId;
    }

    public Laboratoriestb(Integer laboratoriesId, String laboratoriesName) {
        this.laboratoriesId = laboratoriesId;
        this.laboratoriesName = laboratoriesName;
    }

    public Integer getLaboratoriesId() {
        return laboratoriesId;
    }

    public void setLaboratoriesId(Integer laboratoriesId) {
        this.laboratoriesId = laboratoriesId;
    }

    public String getLaboratoriesName() {
        return laboratoriesName;
    }

    public void setLaboratoriesName(String laboratoriesName) {
        this.laboratoriesName = laboratoriesName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (laboratoriesId != null ? laboratoriesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratoriestb)) {
            return false;
        }
        Laboratoriestb other = (Laboratoriestb) object;
        if ((this.laboratoriesId == null && other.laboratoriesId != null) || (this.laboratoriesId != null && !this.laboratoriesId.equals(other.laboratoriesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Laboratoriestb[ laboratoriesId=" + laboratoriesId + " ]";
    }
    
}
