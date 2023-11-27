package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "executive_cancel_request")
@NoArgsConstructor
@AllArgsConstructor
public class ExecutiveCancelRequest {
    private Integer rqst_id;
    private String app_reference;
    private String booked_date;
    private BigInteger requested_by;
    private String message;
    private Date created_datetime;
}
