package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "search_transfer_history")
@NoArgsConstructor
@AllArgsConstructor
public class SearchTransferHistory {
  private Integer origin;
  private Integer domain_origin;
  private String search_type;
  private String country;
  private Date departure_date;
  private Date return_date;
  private String from_terminal;
  private String to_terminal;
  private String from_code;
  private String to_code;
  private String from_location_name;
  private String to_location_name;
  private Integer adult;
  private Integer child;
  private String adult_ages;
  private String child_ages;
  private String trip_type;
  private Integer created_by_id;
  private Date created_datetime;
}
