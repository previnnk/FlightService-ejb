/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Previn
 */
@Entity
@Table(name = "LYIT_CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitCustomer.findAll", query = "SELECT l FROM LyitCustomer l"),
    @NamedQuery(name = "LyitCustomer.findByCustId", query = "SELECT l FROM LyitCustomer l WHERE l.custId = :custId"),
    @NamedQuery(name = "LyitCustomer.findByUsrFname", query = "SELECT l FROM LyitCustomer l WHERE l.usrFname = :usrFname"),
    @NamedQuery(name = "LyitCustomer.findByUsrLname", query = "SELECT l FROM LyitCustomer l WHERE l.usrLname = :usrLname"),
    @NamedQuery(name = "LyitCustomer.findByEmailId", query = "SELECT l FROM LyitCustomer l WHERE l.emailId = :emailId"),
    @NamedQuery(name = "LyitCustomer.findByOthrDetails", query = "SELECT l FROM LyitCustomer l WHERE l.othrDetails = :othrDetails"),
    @NamedQuery(name = "LyitCustomer.findByPassword", query = "SELECT l FROM LyitCustomer l WHERE l.password = :password")})
public class LyitCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CUST_ID")
    private String custId;
    @Size(max = 25)
    @Column(name = "USR_FNAME")
    private String usrFname;
    @Size(max = 25)
    @Column(name = "USR_LNAME")
    private String usrLname;
    @Size(max = 25)
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Size(max = 100)
    @Column(name = "OTHR_DETAILS")
    private String othrDetails;
    @Size(max = 20)
    @Column(name = "PASSWORD")
    private String password;

    public LyitCustomer() {
    }

    public LyitCustomer(String custId) {
        this.custId = custId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getUsrFname() {
        return usrFname;
    }

    public void setUsrFname(String usrFname) {
        this.usrFname = usrFname;
    }

    public String getUsrLname() {
        return usrLname;
    }

    public void setUsrLname(String usrLname) {
        this.usrLname = usrLname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOthrDetails() {
        return othrDetails;
    }

    public void setOthrDetails(String othrDetails) {
        this.othrDetails = othrDetails;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LyitCustomer)) {
            return false;
        }
        LyitCustomer other = (LyitCustomer) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitCustomer[ custId=" + custId + " ]";
    }
    
}
