package com.vivance.gtw.dao.flight;

import com.vivance.gtw.dao.bus.GenderEnum;
import com.vivance.gtw.dao.car.TitleEnum;
import com.vivance.gtw.dao.consumer.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "flight_booking_passenger_details")
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingPassengerDetails {
    private Integer origin;
    private String app_reference;
    private Integer flight_booking_transaction_details_fk;
    private PassengerTypeEnum passenger_type;
    private Integer is_lead;
    private TitleEnum title;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String date_of_bi;
    private GenderEnum gender;
    private String passenger_nationality;
    private String passport_number;
    private String passport_issuing_country;
    private String passport_expiry_d;
    private StatusEnum status;
    private String attributes;
}
