/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightCheckerboard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitFlightCheckerboardFacadeLocal {

    void create(LyitFlightCheckerboard lyitFlightCheckerboard);

    void edit(LyitFlightCheckerboard lyitFlightCheckerboard);

    void remove(LyitFlightCheckerboard lyitFlightCheckerboard);

    LyitFlightCheckerboard find(Object id);

    List<LyitFlightCheckerboard> findAll();

    List<LyitFlightCheckerboard> findRange(int[] range);

    int count();
    
}
