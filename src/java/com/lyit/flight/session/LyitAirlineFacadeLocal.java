/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitAirline;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitAirlineFacadeLocal {

    void create(LyitAirline lyitAirline);

    void edit(LyitAirline lyitAirline);

    void remove(LyitAirline lyitAirline);

    LyitAirline find(Object id);

    List<LyitAirline> findAll();

    List<LyitAirline> findRange(int[] range);

    int count();
    
}
