/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Previn
 */
@Entity
@Table(name = "LYIT_FLIGHT_TRIP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitFlightTrip.findAll", query = "SELECT l FROM LyitFlightTrip l"),
    @NamedQuery(name = "LyitFlightTrip.findByFlightNo", query = "SELECT l FROM LyitFlightTrip l WHERE l.flightNo = :flightNo"),
    @NamedQuery(name = "LyitFlightTrip.findByStatus", query = "SELECT l FROM LyitFlightTrip l WHERE l.status = :status"),
    @NamedQuery(name = "LyitFlightTrip.findByEstTime", query = "SELECT l FROM LyitFlightTrip l WHERE l.estTime = :estTime"),
    @NamedQuery(name = "LyitFlightTrip.findByEstDate", query = "SELECT l FROM LyitFlightTrip l WHERE l.estDate = :estDate"),
    @NamedQuery(name = "LyitFlightTrip.findByActTime", query = "SELECT l FROM LyitFlightTrip l WHERE l.actTime = :actTime"),
    @NamedQuery(name = "LyitFlightTrip.findByActDate", query = "SELECT l FROM LyitFlightTrip l WHERE l.actDate = :actDate"),
    @NamedQuery(name = "LyitFlightTrip.findByGate", query = "SELECT l FROM LyitFlightTrip l WHERE l.gate = :gate"),
    @NamedQuery(name = "LyitFlightTrip.findByTerminal", query = "SELECT l FROM LyitFlightTrip l WHERE l.terminal = :terminal")})
public class LyitFlightTrip implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "EST_TIME")
    @Temporal(TemporalType.TIME)
    private Date estTime;
    @Column(name = "EST_DATE")
    @Temporal(TemporalType.DATE)
    private Date estDate;
    @Column(name = "ACT_TIME")
    @Temporal(TemporalType.TIME)
    private Date actTime;
    @Column(name = "ACT_DATE")
    @Temporal(TemporalType.DATE)
    private Date actDate;
    @Size(max = 50)
    @Column(name = "GATE")
    private String gate;
    @Size(max = 10)
    @Column(name = "TERMINAL")
    private String terminal;

    public LyitFlightTrip() {
    }

    public LyitFlightTrip(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEstTime() {
        return estTime;
    }

    public void setEstTime(Date estTime) {
        this.estTime = estTime;
    }

    public Date getEstDate() {
        return estDate;
    }

    public void setEstDate(Date estDate) {
        this.estDate = estDate;
    }

    public Date getActTime() {
        return actTime;
    }

    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flightNo != null ? flightNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LyitFlightTrip)) {
            return false;
        }
        LyitFlightTrip other = (LyitFlightTrip) object;
        if ((this.flightNo == null && other.flightNo != null) || (this.flightNo != null && !this.flightNo.equals(other.flightNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitFlightTrip[ flightNo=" + flightNo + " ]";
    }
    
}
