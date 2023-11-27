package com.vivance.gtw.dao.hotel;

import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "hotel_booking_itinerary_details")
@NoArgsConstructor
@AllArgsConstructor
public class HotelBookingItineraryDetails {
    private Integer origin;
    private String app_reference;
    private String location;
    private Date check_in;
    private Date check_out;
    private String room_type_name;
    private String bed_type_code;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum status;
    private String smoking_preference;
    private Float total_fare;
    private Float admin_markup;
    private Float agent_markup;
    private String currency;
    private String attributes;
    private Float RoomPrice;
    private Float Tax;
    private Float ExtraGuestCharge;
    private Float ChildCharge;
    private Float OtherCharges;
    private Float Discount;
    private Float ServiceTax;
    private Float AgentCommission;
    private Float gentMarkUp;
    private Float DS;
    private Float gst;
}
