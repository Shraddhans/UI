package com.vivance.gtw.dao.other;

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
@Table(name = "sightseeing_booking_details")
@NoArgsConstructor
@AllArgsConstructor
public class SightseeingBookingDetails {
  private Integer origin;
  private Integer domain_or;
  private StatusEnum status;
  private String app_reference;
  private String booking_source;
  private String booking_id;
  private String booking_reference;
  private String confirmation_reference;
  private String product_name;
  private Integer star_rating;
  private String product_code;
  private String grade_code;
  private String grade_desc;
  private BigInteger phone_number;
  private String alternate_number;
  private String email;
  private Date travel_date;
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
}
