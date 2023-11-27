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
@Table(name = "timeline")
@NoArgsConstructor
@AllArgsConstructor
public class Timeline {
  private BigInteger origin;
  private Integer domain_origin;
  private String event_origin;
  private String event_description;
  private String location;
  private String internal_ip;
  private String external_ip;
  private String city;
  private String country;
  private String country_code;
  private Float lat;
  private Float lon;
  private String attributes;
  private String action_query_string;
  private Integer created_by_id;
  private Date created_datetime;
}
