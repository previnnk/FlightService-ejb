/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyit.flight.controller;

import com.lyit.flight.entity.LyitAirline;
import com.lyit.flight.entity.LyitFlightCheckerboard;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Previn
 */
public class FlightCheckerBoardController {

    
    private EntityManagerFactory emf;

    private EntityManager getEntityManager() {

        if (emf == null) {

            emf = Persistence.createEntityManagerFactory("lyit_flight_pu");

        }

        return emf.createEntityManager();

    }

    public LyitFlightCheckerboard[] getLyitFlightCheckerboard() {

        EntityManager em = getEntityManager();

        try {

            javax.persistence.Query query1 = em.createNamedQuery("LyitFlightCheckerboard.findAll");
            
            System.out.println("+++++++++++++++ Fetching the result "+(query1.getResultList()==null?"is null":query1.getResultList().size()));
            LyitFlightCheckerboard[] LyitFlightCheckerboardArray = (LyitFlightCheckerboard[]) query1.getResultList().toArray(new LyitFlightCheckerboard[0]);
            
            if(LyitFlightCheckerboardArray != null && LyitFlightCheckerboardArray.length >0){
                for(LyitFlightCheckerboard flightCheckerboard:LyitFlightCheckerboardArray){
                    javax.persistence.Query query2 = em.createNamedQuery("LyitAirline.findByAirlineCode").setParameter("airlineCode", flightCheckerboard.getAirlineCode());
                    List<LyitAirline> lyitAirlineList = query2.getResultList();
                    System.out.println("################# lyitAirlineList"+(lyitAirlineList != null && lyitAirlineList.size()>0));
                    if(lyitAirlineList != null && lyitAirlineList.size()>0){
                        System.out.println(lyitAirlineList.get(0).getAirlineCode());
                        flightCheckerboard.setAirlineCode(lyitAirlineList.get(0).getName());
                    }
                }
                
                
            }

            return (LyitFlightCheckerboard[]) query1.getResultList().toArray(new LyitFlightCheckerboard[0]);

        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally {

            em.close();

        }
        return null;
    }

}
