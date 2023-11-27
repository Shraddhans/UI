package com.vivance.gtw.dao.convenience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_city_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiCityList {
    private Integer origin;
    private String destination;
    private String longitude;
    private String latitude;
    private String state_province;
    private Integer country;
    private Integer top_destination;
    private String image;
}
