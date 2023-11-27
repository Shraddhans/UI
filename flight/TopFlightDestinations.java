package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "top_flight_destinations")
@NoArgsConstructor
@AllArgsConstructor
public class TopFlightDestinations {
  private Integer origin;
  private String from_airport_code;
  private String from_airport_name;
  private String to_airport_code;
  private String to_airport_name;
  private String image;
  private Integer status;
}
