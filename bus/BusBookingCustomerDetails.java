package com.vivance.gtw.dao.bus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name  ="bus_booking_customer_details")
@NoArgsConstructor
@AllArgsConstructor
public class BusBookingCustomerDetails {
    private Integer origin;
    private String app_reference;
    private String title;
    private String name;
    private Integer age;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderEnum gender;
    private String seat_no;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CustomerStatusEnum status;
    private String seat_type;
    private String is_ac_seat;
    private Float fare;
    private Float admin_commission;
    private Float agent_commission;
    private Float admin_tds;
    private Float agent_tds;
    private Float gst;
    private Float admin_markup;
    private Float agent_markup;
    private String currency;
    private String attr;
    private Integer updated_by_id;
    private Date updated_datetime;
}
