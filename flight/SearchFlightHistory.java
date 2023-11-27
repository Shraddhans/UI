package com.vivance.gtw.dao.flight;

import java.util.Date;

public class SearchFlightHistory {
    private Integer origin;
    private Integer domain_origin;
    private String search_type;
    private String from_location;
    private String to_location;
    private String from_code;
    private String to_code;
    private TripTypeEnum trip_type;
    private Date journey_date;
    private Integer total_pax;
    private Integer created_by_id;
    private Date created_datetime;
}
