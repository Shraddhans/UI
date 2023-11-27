package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "package_booking_details")
@NoArgsConstructor
@AllArgsConstructor
public class PackageBookingDetails {
    private Integer origin;
    private Integer domain_origin;
    private StatusEnum status;
    private String app_reference;
    private String booking_source;
    private String booking_id;
    private String booking_reference;
    private String confirmation_reference;
    private Integer star_rating;
    private String package_type;
    private BigInteger phone;
    private String email;
    private Date date_of_travel;
    private String payment_mode;
    private String currency;
    private Float currency_conversion_rate;
    private String attributes;
    private Integer created_by_id;
    private Date created_datetime;
}
