package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "car_city")
@NoArgsConstructor
@AllArgsConstructor
public class CarCity {
    private Integer origin;
    private String Country_ISO;
    private String Country_Name_EN;
    private String Region_Name_EN;
    private String City_ID;
    private String City_IATA;
    private String City_Name_EN;
    private String City_Name_DE;
    private String City_Name_FR;
    private String City_Name_IT;
    private String City_Name_HU;
    private String City_Name_PL;
    private String City_Name_PL1;
    private String City_Name_SK;
    private String City_Name_SK1;
    private String City_Name_CZ;
    private String City_Name_ES;
    private String City_Name_RU;
    private String City_Name_CN;
    private String City_Name_SE;
    private String City_Name_BG;
    private String City_Name_NL;
    private String City_Name_TR;
    private String City_Name_DK;
    private String City_Name_FI;
    private String City_Name_RO;
    private String City_Name_NO;
    private String City_Name_FL;
    private String City_Name_IL;
    private String City_Name_PT;
}
