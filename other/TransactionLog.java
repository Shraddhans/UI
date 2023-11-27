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
@Table(name = "transaction_log")
@NoArgsConstructor
@AllArgsConstructor
public class TransactionLog {
  private BigInteger origin;
  private String system_transaction_id;
  private TransactionLogType transaction_type;
  private Integer domain_origin;
  private String app_reference;
  private Float fare;
  private Float domain_markup;
  private Float level_one_markup;
  private Float convinence_fees;
  private Float promocode_discount;
  private Double gst;
  private String currency;
  private Float currency_conversion_rate;
  private Float opening_balance;
  private Float closing_balance;
  private String remarks;
  private Integer transaction_owner_id;
  private Integer created_by_id;
  private Integer sub_agent_id;
  private Date created_datetime;
}
