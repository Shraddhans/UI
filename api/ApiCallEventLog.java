package com.vivance.gtw.dao.api;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "api_call_event_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiCallEventLog {
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
    
    @Column(name = "api_access_log_id")
	private Long apiAccessLogId;
    
    @Column(name = "service_channel")
	private String serviceChannel;
    
    @Column(name = "event_name")
	private String eventName;
    
    @Column(name = "event_type")
	private String eventType;
    
    @Column(name = "headers")
	private String headers;

    @Column(name = "parameters")
	private String parameters;

    @Column(name = "result_token")
	private String resultToken;
    
    @Column(name = "app_payment_refid")
	private String appPaymentRefId;
    
    @Column(name = "content")
	private String content;

    @Column(name = "created_datetime")
	private Date createdDatetime;
    
}
