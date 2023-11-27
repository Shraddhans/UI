package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "car_booking_pax_details")
@NoArgsConstructor
@AllArgsConstructor
public class CarBookingPaxDetails {
    private Integer origin;
    private String app_refe;
    private TitleEnum title;
    private String first_name;
    private String last_name;
    private BigInteger phone;
    private String country_code;
    private String country_name;
    private Date date_of_birth;
    private String city;
    private Integer pincode;
    private String adress1;
    private String adress2;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookingStatusEnum status;

}
