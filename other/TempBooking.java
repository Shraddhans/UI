package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "temp_booking")
@NoArgsConstructor
@AllArgsConstructor
public class TempBooking {
  private BigInteger id;
  private Integer domain_list_fk;
  private String booking_source;
  private String book_id;
  private String book_attributes;
  private String booking_ip;
  private String razorpayOrderId;
  private Date created_datetime;
  private Double convenience_fees;
}
