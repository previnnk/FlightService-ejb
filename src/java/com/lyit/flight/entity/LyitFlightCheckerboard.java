/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Previn
 */
@Entity
@Table(name = "lyit_flight_checkerboard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitFlightCheckerboard.findAll", query = "SELECT l FROM LyitFlightCheckerboard l"),
    @NamedQuery(name = "LyitFlightCheckerboard.findBySchTime", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.schTime = :schTime"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByAirlineCode", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.airlineCode = :airlineCode"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByFlightNo", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.flightNo = :flightNo"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByFromAirport", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.fromAirport = :fromAirport"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByRoute", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.route = :route"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByEstTime", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.estTime = :estTime"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByActTime", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.actTime = :actTime"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByGate", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.gate = :gate"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByTerminal", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.terminal = :terminal"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByStatus", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.status = :status"),
    @NamedQuery(name = "LyitFlightCheckerboard.findByDestAirport", query = "SELECT l FROM LyitFlightCheckerboard l WHERE l.destAirport = :destAirport")})
public class LyitFlightCheckerboard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "SCH_TIME")
    @Temporal(TemporalType.TIME)
    @Id
    private Date schTime;
    @Size(max = 10)
    @Column(name = "AIRLINE_CODE")
    private String airlineCode;
    @Size(max = 10)
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Size(max = 3)
    @Column(name = "FROM_AIRPORT")
    private String fromAirport;
    @Size(max = 20)
    @Column(name = "ROUTE")
    private String route;
    @Column(name = "EST_TIME")
    @Temporal(TemporalType.TIME)
    private Date estTime;
    @Column(name = "ACT_TIME")
    @Temporal(TemporalType.TIME)
    private Date actTime;
    @Size(max = 50)
    @Column(name = "GATE")
    private String gate;
    @Size(max = 10)
    @Column(name = "TERMINAL")
    private String terminal;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 3)
    @Column(name = "DEST_AIRPORT")
    private String destAirport;

    public LyitFlightCheckerboard() {
    }

    public Date getSchTime() {
        return schTime;
    }

    public void setSchTime(Date schTime) {
        this.schTime = schTime;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Date getEstTime() {
        return estTime;
    }

    public void setEstTime(Date estTime) {
        this.estTime = estTime;
    }

    public Date getActTime() {
        return actTime;
    }

    public void setActTime(Date actTime) {
        this.actTime = actTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }
    
}
