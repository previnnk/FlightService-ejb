/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightCheckerboard;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface FlightCheckerSessionLocal {
    public LyitFlightCheckerboard[] getLyitFlightCheckerboardArray();
}
