package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "all_api_city_master")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllApiCityMaster {
    @Column(name = "origin")
    @Id
    private Integer origin;
    private String city_name;
    private String full_city_name;
    private String country_name;
    private String country_code;
    private String grn_city_id;
    private String grn_destination_id;
    private String hb_city_id;
    private Integer tbo_city_id;
    private Integer cache_hotels_count;
    private Integer status;
    private Integer priority;
    private String error;
    private Integer top_destination;
    private String image;
    private Integer mprice;
}
