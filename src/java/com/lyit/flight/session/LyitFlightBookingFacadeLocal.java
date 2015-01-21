/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightBooking;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitFlightBookingFacadeLocal {

    void create(LyitFlightBooking lyitFlightBooking);

    void edit(LyitFlightBooking lyitFlightBooking);

    void remove(LyitFlightBooking lyitFlightBooking);

    LyitFlightBooking find(Object id);

    List<LyitFlightBooking> findAll();

    List<LyitFlightBooking> findRange(int[] range);

    int count();
    
}
