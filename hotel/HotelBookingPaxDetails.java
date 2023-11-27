package com.vivance.gtw.dao.hotel;

import com.vivance.gtw.dao.car.TitleEnum;
import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "hotel_booking_pax_details")
@NoArgsConstructor
@AllArgsConstructor
public class HotelBookingPaxDetails {
    private Integer origin;
    private String app_reference;
    private TitleEnum title;
    private String first_name;
    private String middle_name;
    private String last_name;
    private BigInteger phone;
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "pax_type")
    private PaxTypeEnum pax_type;
    private Integer age;
    private Date date_of_birth;
    private String passenger_nationality;
    private String passport_number;
    private String passport_issuing_country;
    private String passport_expiry_date;
    private StatusEnum status;
    private String attributes;
}
