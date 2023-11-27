package com.vivance.gtw.dao.consumer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "consumer_account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerAccount {
	
    @Id
    @Column(name = "consumer_id")	
	private Long consumerId;
    
    @Column(name = "contract_id")	
	private String contractId;

    @Column(name = "consumer_name")
	private String consumerName;
    
    @Column(name = "login_id")
	private String loginId;
    
    @Column(name = "password")
	private String password;
    
    @Column(name = "email")
	private String email;
    
    @Column(name = "alt_email")
	private String altEmail;

    @Column(name = "phone")
	private String phone;

    @Column(name = "mobile")
	private String mobile;

    @Column(name = "street1")
	private String street1;
    
    @Column(name = "street2")
	private String street2;
    
    @Column(name = "city")
	private String city;
    
    @Column(name = "state_or_province")
	private String state;
    
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
	private StatusEnum staus;

    @Column(name = "postal_code")
	private String postalCode;
    
    @Column(name = "country")
	private String country;
    
    @Column(name = "api_key")
	private String apiKey;    
    
    @Column(name = "created_at")
	private Date createdAt;
    
    @Column(name = "updated_at")
	private Date updatedAt;
    
    @Column(name = "updated_by")
	private String updatedBy;

//	@Override
//	public String toString() {
//		return "ConsumerAccount [consumerId=" + consumerId + ", contract_id=" + contract_id + ", consumerName="
//				+ consumerName + ", loginId=" + loginId + ", password=" + password + ", email=" + email + ", altEmail="
//				+ altEmail + ", phone=" + phone + ", mobile=" + mobile + ", street1=" + street1 + ", street2=" + street2
//				+ ", city=" + city + ", state=" + state + ", staus=" + staus + ", postalCode=" + postalCode
//				+ ", country=" + country + ", apiKey=" + apiKey + ", created_at=" + created_at + ", updated_at="
//				+ updated_at + ", updatedBy=" + updatedBy + "]";
//	}
    
}
