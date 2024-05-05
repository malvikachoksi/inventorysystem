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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nihar
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
    @NamedQuery(name = "Usertb.findByAddress", query = "SELECT u FROM Usertb u WHERE u.address = :address")})
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
    @Size(min = 1, max = 500)
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
    @Lob
    @Size(max = 65535)
    @Column(name = "profile_picture")
    private String profilePicture;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne(optional = false)
    private Countries countryId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne(optional = false)
    private States stateId;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(optional = false)
    private Cities cityId;

    public Usertb() {
    }

    public Usertb(Integer userId) {
        this.userId = userId;
    }

    public Usertb(Integer userId, String username, String password, String firstName, String lastName, String phoneNumber, int userType, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.address = address;
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

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Countries getCountryId() {
        return countryId;
    }

    public void setCountryId(Countries countryId) {
        this.countryId = countryId;
    }

    public States getStateId() {
        return stateId;
    }

    public void setStateId(States stateId) {
        this.stateId = stateId;
    }

    public Cities getCityId() {
        return cityId;
    }

    public void setCityId(Cities cityId) {
        this.cityId = cityId;
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
