package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "car_booking_itinerary_details")
@NoArgsConstructor
@AllArgsConstructor
public class CarBookingItineraryDetails {
    private Integer origin;
    private String app_reference;
    private Date car_from_date;
    private Date car_to_date;
    private String pickup_time;
    private String drop_time;
    private String car_pickup_loc;
    private String car_drop_loc;
    private Float total_fare;
    private Float admin_markup;
    private Float agent_markup;
    private String car_pickup_add;
    private String car_drop_add;
    private String car_name;
    private String pricture_url;
    private String priced_equip;
    private String cancellation_poicy;
    private String attributes;
    private String priced_coverage;
    private ItineraryStatusEnum status;
}
