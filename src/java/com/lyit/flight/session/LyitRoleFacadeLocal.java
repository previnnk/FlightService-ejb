/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitRole;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitRoleFacadeLocal {

    void create(LyitRole lyitRole);

    void edit(LyitRole lyitRole);

    void remove(LyitRole lyitRole);

    LyitRole find(Object id);

    List<LyitRole> findAll();

    List<LyitRole> findRange(int[] range);

    int count();
    
}
