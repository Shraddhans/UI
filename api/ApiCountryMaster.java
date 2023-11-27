package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_country_master")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiCountryMaster {
    private Integer origin;
    private String iso_country_code;
    private String country;
    private String country_name;
}
