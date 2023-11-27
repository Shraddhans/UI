package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "flight_booking_itinerary_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingItineraryDetails {
    private Integer origin;
    private String app_reference;
    private String airline_pnr;
    private Integer segment_indicator;
    private String airline_code;
    private String airline_name;
    private String flight_number;
    private String fare_class;
    private String from_airport_code;
    private String from_airport_name;
    private String to_airport_code;
    private String to_airport_name;
    private Date departure_datetime;
    private Date arrival_datetime;
    private String cabin_baggage;
    private String checkin_baggage;
    private String is_refundable;
    private String status;
    private String operating_carrier;
    private String FareRestriction;
    private String FareBasisCode;
    private Long FareRuleDetail;
    private String attributes;
}
