/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlight;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitFlightFacadeLocal {

    void create(LyitFlight lyitFlight);

    void edit(LyitFlight lyitFlight);

    void remove(LyitFlight lyitFlight);

    LyitFlight find(Object id);

    List<LyitFlight> findAll();

    List<LyitFlight> findRange(int[] range);

    int count();
    
}
