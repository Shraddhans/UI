package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "agent_balance_alert_details")
@NoArgsConstructor
@AllArgsConstructor
public class AgentBalanceAlertDetails {
    private int origin;
    private int agent_fk;
    private float threshold_amount;
    private String mobile_number;
    private String email_id;
    private int enable_sms_notification;
    private int enable_email_notification;
    private int created_by_id;
    private Date created_datetime;

}
