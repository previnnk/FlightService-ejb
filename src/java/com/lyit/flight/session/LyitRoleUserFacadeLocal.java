/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitRoleUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitRoleUserFacadeLocal {

    void create(LyitRoleUser lyitRoleUser);

    void edit(LyitRoleUser lyitRoleUser);

    void remove(LyitRoleUser lyitRoleUser);

    LyitRoleUser find(Object id);

    List<LyitRoleUser> findAll();

    List<LyitRoleUser> findRange(int[] range);

    int count();
    
}
