package com.vivance.gtw.dao.hotel;

import com.vivance.gtw.dao.convenience.StatusEnum;
import com.vivance.gtw.dao.convenience.ValueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "hotel_booking_details")
@NoArgsConstructor
@AllArgsConstructor
public class HotelBookingDetails {
    private Integer origin;
    private Integer domain_origin;
    private StatusEnum status;
    private String app_reference;
    private String booking_source;
    private String booking_id;
    private String booking_reference;
    private String confirmation_reference;
    private String hotel_name;
    private Integer star_rating;
    private String hotel_code;
    private BigInteger phone_number;
    private String alternate_number;
    private String email;
    private Date hotel_check_in;
    private Date hotel_check_out;
    private String payment_mode;
    private Float convinence_value;
    @Enumerated(EnumType.STRING)
    @Column(name = "convinence_value_type")
    private ValueTypeEnum convinence_value_type;
    private Integer convinence_per_pax;
    private Float convinence_amount;
    private String promo_code;
    private Float discount;
    private String currency;
    private Float currency_conversion_rate;
    private String attributes;
    private Integer created_by_id;
    private Integer sub_agent_id;
    private Date created_datetime;
    private String hb_supplier_code;
    private String hb_vat_number;
}
