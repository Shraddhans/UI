package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "car_booking_extra_details")
@NoArgsConstructor
@AllArgsConstructor
public class CarBookingExtraDetails {
    private Integer origin;
    private String app_reference;
    private String description;
    private Integer equiptype;
    private Integer qunatity;
    private Float amount;

}
