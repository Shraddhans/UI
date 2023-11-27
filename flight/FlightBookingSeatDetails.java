package com.vivance.gtw.dao.flight;

import com.vivance.gtw.dao.convenience.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "flight_booking_seat_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingSeatDetails {
    private Integer origin;
    private Integer passenger_fk;
    private String from_airport_code;
    private String to_airport_code;
    private String airline_code;
    private String flight_number;
    private String description;
    private Float price;
    private String code;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeEnum type;

}
