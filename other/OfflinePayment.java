package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "offline_payment")
@NoArgsConstructor
@AllArgsConstructor
public class OfflinePayment {
  private Integer id;
  private String company_name;
  private String name;
  private String email;
  private Integer phone;
  private Integer amount;
  private String remarks;
  private Date created_date;
  private String refernce_code;
}
