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
public class ConsumerDomainAttr {

    @Id
    @Column(name = "domain_attr_id")	
	private Long domainAttrId;

    @Column(name = "domain_id")	
	private Long domainId;

    @Column(name = "consumer_id")	
	private Long consumerId;

    @Column(name = "attr_name")	
	private String attrName;

    @Column(name = "attr_type")	
	private String attrType;

    @Column(name = "attr_value")	
	private String attrValue;

    @Column(name = "created_at")
	private Date createdAt;
    
    @Column(name = "updated_at")
	private Date updatedAt;
    
    @Column(name = "updated_by")
	private String updatedBy;
	
	
}
