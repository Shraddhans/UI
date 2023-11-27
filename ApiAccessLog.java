package com.vivance.gtw.dao;

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
@Table(name = "api_access_log")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ApiAccessLog {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @GeneratedValue(generator = "uuid-hibernate-generator")
//    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
	private Long Id;
    
    @Column(name = "module")
	private String module;
    
    @Column(name = "user_session_id")
	private String userSessionId;
    
    @Column(name = "consumer_app_key")
	private String consumerAppKey;
    
    @Column(name = "consumer_domain_key")
	private String consumerDomainKey;
    
    @Column(name = "url_or_action")
	private String urlOrAction;
    
    @Column(name = "result_token")
	private String resultToken;
    
    @Column(name = "app_payment_refid")
	private String appPaymentRefId;    

    @Column(name = "ip_address")
	private String ipAddress;

    @Column(name = "created_datetime")
	private Date createdDatetime;
}

