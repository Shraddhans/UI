package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "state_list")
@NoArgsConstructor
@AllArgsConstructor
public class StateList {
  private Integer origin;
  private String loc_id;
  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private StateTypeEnum type;
  private String en_name;
  private Integer priority;
  private Integer country_oid;
  private String abbr;
  private Integer area_km2;

}
