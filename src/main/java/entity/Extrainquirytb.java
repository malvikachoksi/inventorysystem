/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "extrainquirytb")
@NamedQueries({
    @NamedQuery(name = "Extrainquirytb.findAll", query = "SELECT e FROM Extrainquirytb e"),
    @NamedQuery(name = "Extrainquirytb.findByExtrainquiryId", query = "SELECT e FROM Extrainquirytb e WHERE e.extrainquiryId = :extrainquiryId"),
    @NamedQuery(name = "Extrainquirytb.findByAllDiamonads", query = "SELECT e FROM Extrainquirytb e WHERE e.allDiamonads = :allDiamonads"),
    @NamedQuery(name = "Extrainquirytb.findByQuantity", query = "SELECT e FROM Extrainquirytb e WHERE e.quantity = :quantity"),
    @NamedQuery(name = "Extrainquirytb.findByDateTime", query = "SELECT e FROM Extrainquirytb e WHERE e.dateTime = :dateTime")})
public class Extrainquirytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "extrainquiry_id")
    private Integer extrainquiryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "all_diamonads")
    private int allDiamonads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_time")
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Usertb userId;

    public Extrainquirytb() {
    }

    public Extrainquirytb(Integer extrainquiryId) {
        this.extrainquiryId = extrainquiryId;
    }

    public Extrainquirytb(Integer extrainquiryId, int allDiamonads, int quantity, Date dateTime) {
        this.extrainquiryId = extrainquiryId;
        this.allDiamonads = allDiamonads;
        this.quantity = quantity;
        this.dateTime = dateTime;
    }

    public Integer getExtrainquiryId() {
        return extrainquiryId;
    }

    public void setExtrainquiryId(Integer extrainquiryId) {
        this.extrainquiryId = extrainquiryId;
    }

    public int getAllDiamonads() {
        return allDiamonads;
    }

    public void setAllDiamonads(int allDiamonads) {
        this.allDiamonads = allDiamonads;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Usertb getUserId() {
        return userId;
    }

    public void setUserId(Usertb userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extrainquiryId != null ? extrainquiryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extrainquirytb)) {
            return false;
        }
        Extrainquirytb other = (Extrainquirytb) object;
        if ((this.extrainquiryId == null && other.extrainquiryId != null) || (this.extrainquiryId != null && !this.extrainquiryId.equals(other.extrainquiryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Extrainquirytb[ extrainquiryId=" + extrainquiryId + " ]";
    }
    
}
