package com.vivance.gtw.dao.flight;

import com.vivance.gtw.dao.convenience.ApiRefundStatusEnum;
import com.vivance.gtw.dao.convenience.RefundPaymentModeEnum;
import com.vivance.gtw.dao.convenience.RefundStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flight_cancellation_details")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class FlightCancellationDetails {
    private Integer origin;
    private Integer passenger_fk;
    private String RequestId;
    private String ChangeRequestStatus;
    private String statusDescription;
    private String API_RefundedAmount;
    private String API_CancellationCharge;
    private Float API_ServiceTaxOnRefundAmount;
    private Float API_SwachhBharatCess;
    @Column(name = "API_refund_status")
    @Enumerated(EnumType.STRING)
    private ApiRefundStatusEnum API_refund_status;
    private Date cancellation_requested_on;
    private Date cancellation_processed_on;
    private Float refund_amount;
    private Float cancellation_charge;
    private Float service_tax_on_refund_amount;
    private Float swachh_bharat_cess;
    @Column(name = "refund_status")
    @Enumerated(EnumType.STRING)
    private RefundStatusEnum refund_status;
    @Column(name = "refund_payment_mode")
    @Enumerated(EnumType.STRING)
    private RefundPaymentModeEnum refund_payment_mode;
    private String refund_comments;
    private Date refund_date;
    private String currency;
    private Float currency_conversion_rate;
    private Integer created_by_id;
    private Date created_datetime;
}
