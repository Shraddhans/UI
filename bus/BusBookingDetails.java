package com.vivance.gtw.dao.bus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "bus_booking_details")
@NoArgsConstructor
@AllArgsConstructor
public class BusBookingDetails {
    private Integer origin;
    private Integer domain_origin;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BusBookingStatusEnum status;
    private String app_reference;
    private String booking_source;
    private String pnr;
    private String ticket;
    private String transaction;
    private BigInteger phone_number;
    private String alternate_number;
    private String email;
    private String payment_mode;
    private Float convinence_value;
    @Enumerated(EnumType.STRING)
    @Column(name = "convinence_value_type")
    private ConvinenceValueTypeEnum convinence_value_type;
    private Integer convinence_per_pax;
    private Float convinence_amount;
    private Float gst;
    private String promo_code;
    private Float discount;
    private String currency;
    private Float currency_conversion_rate;
    private Integer created_by_id;
    private Integer sub_agent_id;
    private String cancel_policy;
    private Date created_datetime;
}
