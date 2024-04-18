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
 * @author DELL
 */
@Entity
@Table(name = "inquirytb")
@NamedQueries({
    @NamedQuery(name = "Inquirytb.findAll", query = "SELECT i FROM Inquirytb i"),
    @NamedQuery(name = "Inquirytb.findByInquiryId", query = "SELECT i FROM Inquirytb i WHERE i.inquiryId = :inquiryId"),
    @NamedQuery(name = "Inquirytb.findByDiamonadId", query = "SELECT i FROM Inquirytb i WHERE i.diamonadId = :diamonadId"),
    @NamedQuery(name = "Inquirytb.findByDateTime", query = "SELECT i FROM Inquirytb i WHERE i.dateTime = :dateTime"),
    @NamedQuery(name = "Inquirytb.findByQuantity", query = "SELECT i FROM Inquirytb i WHERE i.quantity = :quantity")})
public class Inquirytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "inquiry_id")
    private Integer inquiryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diamonad_id")
    private int diamonadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_time")
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Usertb userId;

    public Inquirytb() {
    }

    public Inquirytb(Integer inquiryId) {
        this.inquiryId = inquiryId;
    }

    public Inquirytb(Integer inquiryId, int diamonadId, Date dateTime, int quantity) {
        this.inquiryId = inquiryId;
        this.diamonadId = diamonadId;
        this.dateTime = dateTime;
        this.quantity = quantity;
    }

    public Integer getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(Integer inquiryId) {
        this.inquiryId = inquiryId;
    }

    public int getDiamonadId() {
        return diamonadId;
    }

    public void setDiamonadId(int diamonadId) {
        this.diamonadId = diamonadId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        hash += (inquiryId != null ? inquiryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inquirytb)) {
            return false;
        }
        Inquirytb other = (Inquirytb) object;
        if ((this.inquiryId == null && other.inquiryId != null) || (this.inquiryId != null && !this.inquiryId.equals(other.inquiryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inquirytb[ inquiryId=" + inquiryId + " ]";
    }
    
}
