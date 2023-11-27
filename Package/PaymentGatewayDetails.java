package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name  = "payment_gateway_details")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentGatewayDetails {
    private BigInteger origin;
    private Integer domain_origi;
    private String app_reference;
    private PaymentStatusEnum status;
    private Float amount;
    private String currency;
    private Float currency_conversion_rate;
    private String request_params;
    private String response_params;
    private Date created_datetime;
}
