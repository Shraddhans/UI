package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "country_list")
@NoArgsConstructor
@AllArgsConstructor
public class CountryList {
    private Integer origin;
    private String loc_id;
    private String en_name;
    private String iso_country_code;
    private String phone_code;
}
