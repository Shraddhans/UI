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
@Table(name = "Consumer_transaction_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerTransactionDetails {
	
    @Id
    @Column(name = "id")	
	private Long id;

    @Column(name = "consumer_domain_id")	
    private Long consumerDomainId;

    @Column(name = "user_oid")	
	private String userOid;

    @Column(name = "type")	
	private String type; // enum('vivance','b2b','corporate','sub_corporate','Debit') NOT NULL DEFAULT 'vivance',

    @Column(name = "system_transaction_id")	
	private String systemTransactionId;

    @Column(name = "transaction_type")	// enum('Cash','Check___DD','ETransfer','Wallet','Credit') NOT NULL DEFAULT 'Cash',
	private String transactionType;

    @Column(name = "amount")	
	private double amount;

    @Column(name = "currency")	
	private String currency;

    @Column(name = "currency_conversion_rate")	
	private float currencyConversionRate;

    @Column(name = "date_of_transaction")	
	private Date dateOfTransaction;

    @Column(name = "bank")	
	private String bank;

    @Column(name = "branch")	
	private String branch;

    @Column(name = "deposited_branch")	
	private String depositedBranch;

    @Column(name = "transaction_number")	
	private String transactionNumber;

    @Column(name = "status") //enum('accepted','rejected','pending') DEFAULT NULL,
	private String status;

    @Column(name = "remarks")	
	private String remarks;

    @Column(name = "update_remarks")	
	private String update_remarks;

    @Column(name = "conversion_value")	
	private String conversionValue;

    @Column(name = "currency_converter_id")	
	private String currencyConverterId;

    @Column(name = "created_datetime")
	private Date createdDatetime;
    
    @Column(name = "created_by_id")
	private String createdById;

    @Column(name = "updated_datetime")
	private Date updatedDatetime;
    
    @Column(name = "updated_by_id")
	private String updatedById;

}
