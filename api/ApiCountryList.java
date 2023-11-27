package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_country_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiCountryList {
    private Integer origin;
    private Integer api_continent_list_fk;
    private String name;
    private String country_code;
    private String iso_country_code;
}
