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
@Table(name = "LYIT_FLIGHT_BOOKING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitFlightBooking.findAll", query = "SELECT l FROM LyitFlightBooking l"),
    @NamedQuery(name = "LyitFlightBooking.findByFlightNo", query = "SELECT l FROM LyitFlightBooking l WHERE l.flightNo = :flightNo"),
    @NamedQuery(name = "LyitFlightBooking.findByBookingId", query = "SELECT l FROM LyitFlightBooking l WHERE l.bookingId = :bookingId"),
    @NamedQuery(name = "LyitFlightBooking.findByCustomerId", query = "SELECT l FROM LyitFlightBooking l WHERE l.customerId = :customerId"),
    @NamedQuery(name = "LyitFlightBooking.findByResStatus", query = "SELECT l FROM LyitFlightBooking l WHERE l.resStatus = :resStatus")})
public class LyitFlightBooking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "BOOKING_ID")
    private String bookingId;
    @Size(max = 20)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Size(max = 20)
    @Column(name = "RES_STATUS")
    private String resStatus;

    public LyitFlightBooking() {
    }

    public LyitFlightBooking(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getResStatus() {
        return resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LyitFlightBooking)) {
            return false;
        }
        LyitFlightBooking other = (LyitFlightBooking) object;
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitFlightBooking[ bookingId=" + bookingId + " ]";
    }
    
}
