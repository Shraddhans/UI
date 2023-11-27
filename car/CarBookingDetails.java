package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "car_booking_details")
@NoArgsConstructor
@AllArgsConstructor
public class CarBookingDetails {
  private Integer origin;
  private Integer domain_origin;
  @Enumerated(EnumType.STRING)
  @Column(name = "status")
  private StatusEnum status;
  private String app_reference;
  private String booking_source;
  private String booking_id;
  private String booking_reference;
  private Float total_fare;
  private String currency;
  private Float currency_conversion_rate;
  private String car_name;
  private String car_supplier_name;
  private String supplier_;
  private String car_model;
  private BigInteger phone_number;
  private String alternate_number;
  private String email;
  private Date car_from_date;
  private String pickup_time;
  private String drop_time;
  private Date car_to_date;
  private String car_pickup_lcatio;
  private String car_drop_location;
  private String car_pickup_address;
  private String car_drop_address;
  private Float oneway_fee;
  private String transfer_type;
  private Date final_cancel_date;
  private String promo_code;
  private Float discount;
  private Float convinence_amount;
  private Float convinence_value;
  private Integer convinence_per_pax;
  @Enumerated(EnumType.STRING)
  @Column(name = "convinence_value_type")
  private ConvinenceValueTypeEnum convinence_value_type;
  private String payment_mode;
  private Integer created_by_id;
  private String attributes;
  private Date created_datetime;
  private Date updated_datetime;
}
