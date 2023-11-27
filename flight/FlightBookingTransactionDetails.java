package com.vivance.gtw.dao.flight;

import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "flight_booking_transaction_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingTransactionDetails {
    private Integer origin;
    private String app_reference;
    private String pnr;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum status;
    private String status_description;
    private String book_id;
    private String gds_pnr;
    private String source;
    private String ref_id;
    private float total_fare;
    private Float admin_commission;
    private Float agent_commission;
    private Float admin_tds;
    private Float agent_tds;
    private Float admin_markup;
    private Float agent_markup;
    private Float gst;
    private String currency;
    private String getbooking_StatusCode;
    private String getbooking_Description;
    private String getbooking_Category;
    private String attributes;
    private Integer sequence_number;
    private Integer hold_ticket_req_status;
}
