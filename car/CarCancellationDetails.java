package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "car_cancellation_details")
@NoArgsConstructor
@AllArgsConstructor
public class CarCancellationDetails {
    private Integer origin;
    private String app_reference;
    private String ChangeRequestId;
    private String ChangeRequestStatus;
    private String status_description;
    private String API_RefundedAmount;
    private String API_CancellationCharge;
    private Date cancellation_processed_on;
    private Float refund_amount;
    private Float cancellation_charge;
    @Enumerated(EnumType.STRING)
    @Column(name = "refund_status")
    private RefundStatusEnum refund_status;
    @Enumerated(EnumType.STRING)
    @Column(name = "refund_payment_mode")
    private RefundPaymentModeEnum refund_payment_mode;
    private String refund_comments;
    private Date refund_date;
    private String currency;
    private Float currency_conversion_rate;
    private String attributes;
    private Integer created_by_id;
    private Date created_datetime;
}
