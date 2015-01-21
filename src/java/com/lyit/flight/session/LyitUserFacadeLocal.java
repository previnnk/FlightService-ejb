/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitUserFacadeLocal {

    void create(LyitUser lyitUser);

    void edit(LyitUser lyitUser);

    void remove(LyitUser lyitUser);

    LyitUser find(Object id);

    List<LyitUser> findAll();

    List<LyitUser> findRange(int[] range);

    int count();
    
}
