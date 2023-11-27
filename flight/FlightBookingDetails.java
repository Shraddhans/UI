package com.vivance.gtw.dao.flight;
import java.util.Date;

import com.vivance.gtw.dao.convenience.ConvinenceValueTypeEnum;
import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "flight_booking_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingDetails {
    private Integer origin;
    private Integer domain_origin;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    private String app_reference;
    private String booking_source;
    private String trip_type;
    private String phone;
    private String alternate_number;
    private String email;
    private Date journey_start;
    private Date journey_end;
    private String journey_from;
    private String journey_to;
    private String from_loc;
    private String to_loc;
    private String cabin_class;
    private String payment_mode;
    private Float convinence_value;
    @Column(name = "convinence_value_type")
    @Enumerated(EnumType.STRING)
    private ConvinenceValueTypeEnum convinence_value_type;
    private Integer convinence_per_pax;
    private Float convinence_amount;
    private Float discount;
    private String promo_code;
    private String currency;
    private Float currency_conversion_rate;
    private String attributes;
    private String gst_details;
    private Integer created_by_id;
    private Integer sub_agent_id;
    private Date created_datetime;
}
