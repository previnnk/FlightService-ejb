/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.session;

import com.lyit.flight.entity.LyitFlightCheckerboard;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Previn
 */
@Stateless
public class LyitFlightCheckerboardFacade extends AbstractFacade<LyitFlightCheckerboard> implements LyitFlightCheckerboardFacadeLocal {
   // @PersistenceContext(unitName = "ie.lyit.project.dashboard_LyitFlightCheckerBoardEA-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LyitFlightCheckerboardFacade() {
        super(LyitFlightCheckerboard.class);
    }
    
}
