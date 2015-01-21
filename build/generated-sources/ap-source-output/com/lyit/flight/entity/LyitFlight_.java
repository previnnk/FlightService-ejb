package com.lyit.flight.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-20T11:26:33")
@StaticMetamodel(LyitFlight.class)
public class LyitFlight_ { 

    public static volatile SingularAttribute<LyitFlight, String> destCountry;
    public static volatile SingularAttribute<LyitFlight, String> fromCountry;
    public static volatile SingularAttribute<LyitFlight, String> flightNo;
    public static volatile SingularAttribute<LyitFlight, String> route;
    public static volatile SingularAttribute<LyitFlight, String> flightFrequency;
    public static volatile SingularAttribute<LyitFlight, String> aircraft;
    public static volatile SingularAttribute<LyitFlight, Date> schTime;
    public static volatile SingularAttribute<LyitFlight, String> id;
    public static volatile SingularAttribute<LyitFlight, String> destAirport;
    public static volatile SingularAttribute<LyitFlight, String> fromAirport;
    public static volatile SingularAttribute<LyitFlight, String> airlineId;

}