package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "flight_airport_timezone_offset")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightAirportTimezoneOffset {
    private Integer flight_airport_list_fk;
    private Integer start_month;
    private Integer end_month;
    private String timezone_offset;
}



