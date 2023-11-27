package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "flight_booking_meal_details")
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingMealDetails {
    private Integer origin;
    private Integer passenger_fk;
    private String from_airport_code;
    private String to_airport_code;
    private String description;
    private Float price;
    private String code;
    //private String type` enum('static','dynamic')
}
