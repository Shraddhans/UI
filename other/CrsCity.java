package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "crs_city")
@NoArgsConstructor
@AllArgsConstructor
public class CrsCity {
    private Integer id;
    private String country;
    private String city;
    private String city_image;
    private String city_lat;
    private String city_long;
}
