package com.lyit.flight.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-20T11:26:33")
@StaticMetamodel(LyitFlightCheckerboard.class)
public class LyitFlightCheckerboard_ { 

    public static volatile SingularAttribute<LyitFlightCheckerboard, String> flightNo;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> route;
    public static volatile SingularAttribute<LyitFlightCheckerboard, Date> schTime;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> airlineCode;
    public static volatile SingularAttribute<LyitFlightCheckerboard, Date> actTime;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> gate;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> terminal;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> destAirport;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> fromAirport;
    public static volatile SingularAttribute<LyitFlightCheckerboard, Date> estTime;
    public static volatile SingularAttribute<LyitFlightCheckerboard, String> status;

}