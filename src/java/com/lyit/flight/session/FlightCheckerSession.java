/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightCheckerboard;
import javax.ejb.Stateless;
import com.lyit.flight.controller.FlightCheckerBoardController;

/**
 *
 * @author Previn
 */
@Stateless
public class FlightCheckerSession implements FlightCheckerSessionLocal {

    private LyitFlightCheckerboard[] lyitFlightCheckerboardArray;

    public LyitFlightCheckerboard[] getLyitFlightCheckerboardArray() {
        FlightCheckerBoardController flightCheckerBoardController = new FlightCheckerBoardController();
         System.out.println("+++++++++++++++ Fetching the result 12345");
        this.lyitFlightCheckerboardArray = flightCheckerBoardController.getLyitFlightCheckerboard();
         System.out.println("+++++++++++++++ lyitFlightCheckerboardArray "+(lyitFlightCheckerboardArray == null?"Is Null":lyitFlightCheckerboardArray.length));
        return lyitFlightCheckerboardArray;
    }

    public void setLyitFlightCheckerboardArray(LyitFlightCheckerboard[] lyitFlightCheckerboardArray) {
        this.lyitFlightCheckerboardArray = lyitFlightCheckerboardArray;
    }
    
    

}
