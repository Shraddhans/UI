package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "search_car_history")
@NoArgsConstructor
@AllArgsConstructor
public class SearchCarHistory {
    private Integer origin;
    private Integer domain_origin;
    private String search_type;
    private String from_location;
    private String from_loc_id;
    private String from_loc_code;
    private String to_location;
    private String to_loc_id;
    private String to_loc_code;
    private Date depature;
    @Column(name = "return")
    private Date Return;
    private Integer driver_age;
    private String created_by_id;
    private Date created_datetime;
}
