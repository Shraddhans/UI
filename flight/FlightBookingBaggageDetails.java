package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_booking_baggage_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingBaggageDetails {
    private Integer origin;
    private String passenger_fk;
    private String from_airport_code;
    private String to_airport_code;
    private String description;
    private Float price;
    private String code;
}
