/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.service;

import com.lyit.flight.entity.LyitFlightCheckerboard;
import com.lyit.flight.session.FlightCheckerSessionLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;

/**
 *
 * @author Previn
 */
@WebService(serviceName = "FlightCheckerService")
@Stateless()
public class FlightCheckerService {
    @EJB
    private FlightCheckerSessionLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getLyitFlightCheckerboardArray")
    public LyitFlightCheckerboard[] getLyitFlightCheckerboardArray() {
        return ejbRef.getLyitFlightCheckerboardArray();
    }
    
}
