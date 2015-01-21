/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitCustomer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Previn
 */
@Local
public interface LyitCustomerFacadeLocal {

    void create(LyitCustomer lyitCustomer);

    void edit(LyitCustomer lyitCustomer);

    void remove(LyitCustomer lyitCustomer);

    LyitCustomer find(Object id);

    List<LyitCustomer> findAll();

    List<LyitCustomer> findRange(int[] range);

    int count();
    
}
