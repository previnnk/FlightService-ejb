/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightTrip;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitFlightTripFacadeLocal {

    void create(LyitFlightTrip lyitFlightTrip);

    void edit(LyitFlightTrip lyitFlightTrip);

    void remove(LyitFlightTrip lyitFlightTrip);

    LyitFlightTrip find(Object id);

    List<LyitFlightTrip> findAll();

    List<LyitFlightTrip> findRange(int[] range);

    int count();
    
}
