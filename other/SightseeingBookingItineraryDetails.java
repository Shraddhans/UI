package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "sightseeing_booking_itinerary_details")
@NoArgsConstructor
@AllArgsConstructor
public class SightseeingBookingItineraryDetails {
  private Integer origin;
  private String app_reference;
  private String location;
  private Date travel_date;
  private String grade_code;
  private StatusEnum status;
  private Float total_fare;
  private Float admin_markup;
  private Float admin_net_markup;
  private Float agent_markup;
  private Float admin_commission;
  private Float admin_tds;
  private Float agent_commission;
  private Float agent_tds;
  private Float api_raw_fare;
  private Float agent_buying_price;
  private String currency;
  private String attributes;
  private Float ProductPrice;
  private Float Discount;
  private Float Tax;
  private Float gst;
}
