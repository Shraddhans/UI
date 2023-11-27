package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "master_transaction_details")
@NoArgsConstructor
@AllArgsConstructor
public class MasterTransactionDetails {
  private BigInteger origin;
  private TypeEnum type;
  private Integer user_oid;
  private String system_transaction_id;
  private Integer domain_list_fk;
  @Enumerated(EnumType.STRING)
  @Column(name = "transaction_type")
  private TransactionTypeEnum transaction_type;
  private Double amount;
  private String currency;
  private Float currency_conversion_rate;
  private Date date_of_transaction;
  private String bank;
  private String branch;
  private String deposited_branch;
  private String transaction_number;
  private StatusEnum status;
  private String remarks;
  private String update_remarks;
  private Date created_datetime;
  private Integer created_by_id;
  private Date updated_datetime;
  private Integer updated_by_id;
  private String image;
  private Float conversion_value;
  private Integer currency_converter_origin;
}
