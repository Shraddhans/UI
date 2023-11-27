package com.vivance.gtw.dao.api;

import com.vivance.gtw.dao.other.StateTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "api_state_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiStateList {
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
