package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sms_configuration")
@NoArgsConstructor
@AllArgsConstructor
public class SmsConfiguration {
  private Integer origin;
  private Integer domain_origin;
  private String gateway;
  private String username;
  private String password;
  private String from_name;
  private String url;
}
