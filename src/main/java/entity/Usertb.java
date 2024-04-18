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
@Table(name = "usertb")
@NamedQueries({
    @NamedQuery(name = "Usertb.findAll", query = "SELECT u FROM Usertb u"),
    @NamedQuery(name = "Usertb.findByUserId", query = "SELECT u FROM Usertb u WHERE u.userId = :userId"),
    @NamedQuery(name = "Usertb.findByUsername", query = "SELECT u FROM Usertb u WHERE u.username = :username"),
    @NamedQuery(name = "Usertb.findByPassword", query = "SELECT u FROM Usertb u WHERE u.password = :password"),
    @NamedQuery(name = "Usertb.findByFirstName", query = "SELECT u FROM Usertb u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Usertb.findByLastName", query = "SELECT u FROM Usertb u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Usertb.findByPhoneNumber", query = "SELECT u FROM Usertb u WHERE u.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Usertb.findByUserType", query = "SELECT u FROM Usertb u WHERE u.userType = :userType"),
    @NamedQuery(name = "Usertb.findByAddress", query = "SELECT u FROM Usertb u WHERE u.address = :address"),
    @NamedQuery(name = "Usertb.findByCityId", query = "SELECT u FROM Usertb u WHERE u.cityId = :cityId"),
    @NamedQuery(name = "Usertb.findByStateId", query = "SELECT u FROM Usertb u WHERE u.stateId = :stateId"),
    @NamedQuery(name = "Usertb.findByCountryId", query = "SELECT u FROM Usertb u WHERE u.countryId = :countryId")})
public class Usertb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type")
    private int userType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Address")
    private String address;
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
    @Column(name = "country_id")
    private int countryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Inquirytb> inquirytbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Extrainquirytb> extrainquirytbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Grouptb> grouptbCollection;

    public Usertb() {
    }

    public Usertb(Integer userId) {
        this.userId = userId;
    }

    public Usertb(Integer userId, String username, String password, String firstName, String lastName, String phoneNumber, int userType, String address, int cityId, int stateId, int countryId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.address = address;
        this.cityId = cityId;
        this.stateId = stateId;
        this.countryId = countryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Collection<Inquirytb> getInquirytbCollection() {
        return inquirytbCollection;
    }

    public void setInquirytbCollection(Collection<Inquirytb> inquirytbCollection) {
        this.inquirytbCollection = inquirytbCollection;
    }

    public Collection<Extrainquirytb> getExtrainquirytbCollection() {
        return extrainquirytbCollection;
    }

    public void setExtrainquirytbCollection(Collection<Extrainquirytb> extrainquirytbCollection) {
        this.extrainquirytbCollection = extrainquirytbCollection;
    }

    public Collection<Grouptb> getGrouptbCollection() {
        return grouptbCollection;
    }

    public void setGrouptbCollection(Collection<Grouptb> grouptbCollection) {
        this.grouptbCollection = grouptbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertb)) {
            return false;
        }
        Usertb other = (Usertb) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usertb[ userId=" + userId + " ]";
    }
    
}
