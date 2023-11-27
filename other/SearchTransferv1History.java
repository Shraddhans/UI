package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "search_transferv1_history")
@NoArgsConstructor
@AllArgsConstructor
public class SearchTransferv1History {
  private Integer origin;
  private Integer domain_origin;
  private Integer created_by_id;
  private String search_type;
  private String destination_name;
  private Integer destination_id;
  private Integer category_id;
  private Date from_date;
  private Date to_date;
  private Date created_datetime;
}
