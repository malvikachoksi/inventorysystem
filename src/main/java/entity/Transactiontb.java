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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "transactiontb")
@NamedQueries({
    @NamedQuery(name = "Transactiontb.findAll", query = "SELECT t FROM Transactiontb t"),
    @NamedQuery(name = "Transactiontb.findByTransactionId", query = "SELECT t FROM Transactiontb t WHERE t.transactionId = :transactionId"),
    @NamedQuery(name = "Transactiontb.findByDiamonadId", query = "SELECT t FROM Transactiontb t WHERE t.diamonadId = :diamonadId"),
    @NamedQuery(name = "Transactiontb.findByUserId", query = "SELECT t FROM Transactiontb t WHERE t.userId = :userId"),
    @NamedQuery(name = "Transactiontb.findByTransactionDate", query = "SELECT t FROM Transactiontb t WHERE t.transactionDate = :transactionDate")})
public class Transactiontb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diamonad_id")
    private int diamonadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_date")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "transaction_type")
    private String transactionType;

    public Transactiontb() {
    }

    public Transactiontb(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Transactiontb(Integer transactionId, int diamonadId, int userId, Date transactionDate, String transactionType) {
        this.transactionId = transactionId;
        this.diamonadId = diamonadId;
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public int getDiamonadId() {
        return diamonadId;
    }

    public void setDiamonadId(int diamonadId) {
        this.diamonadId = diamonadId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactiontb)) {
            return false;
        }
        Transactiontb other = (Transactiontb) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Transactiontb[ transactionId=" + transactionId + " ]";
    }
    
}
