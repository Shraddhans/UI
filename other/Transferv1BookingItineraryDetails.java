package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "transferv1_booking_itinerary_details")
@NoArgsConstructor
@AllArgsConstructor
public class Transferv1BookingItineraryDetails {
    private Integer origin;
    private String app_reference;
    private String location;
    private Date travel_date;
    private String grade_code;
    private String grade_desc;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
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
    private Float gst;
    private String currency;
    private String attributes;
    private Float ProductPrice;
    private Float Discount;
    private Float Tax;
}
