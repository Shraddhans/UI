package com.vivance.gtw.dao.consumer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "consumer_domain")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerDomain {
	
    @Id
    @Column(name = "domain_id")	
	private Long domainId;

    @Column(name = "consumer_id")	
    private Long consumerId;

    @Column(name = "domain_key")	
	private String domainKey;

    @Column(name = "domain_urls")	
	private String domainUrls; //Multiple domain/IP list separated by comma

    @Column(name = "domain_user")	
	private String domainUser;

    @Column(name = "domain_password")	
	private String domainPassword;

    @Column(name = "environment")	
	private String environment;

    @Column(name = "credit_limit")	
	private double creditLimit;

    @Column(name = "status")	
	private String status;

    @Column(name = "created_at")
	private Date createdAt;
    
    @Column(name = "updated_at")
	private Date updatedAt;
    
    @Column(name = "updated_by")
	private String updatedBy;
	//domain_key":"TMX5193291565602439","username":"test229267","password":"test@229","system":"test","domain_id":null}

}
