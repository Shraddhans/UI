package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "car_airport")
@NoArgsConstructor
@AllArgsConstructor
public class CarAirport {
    private Integer origin;
    private String Country_ISO;
    private String Country_Name_EN;
    private String Region_Name_EN;
    private Integer Airport_ID;
    private String Airport_IATA;
    private String Airport_Name_EN;
    private String Airport_Name_DE;
    private String Airport_Name_FR;
    private String Airport_Name_IT;
    private String Airport_Name_HU;
    private String Airport_Name_PL;
    private String Airport_Name_SK;
    private String Airport_Name_CZ;
    private String Airport_Name_ES;
    private String Airport_Name_RU;
    private String Airport_Name_RU1;
    private String Airport_Name_CN;
    private String Airport_Name_SE;
    private String Airport_Name_BG;
    private String Airport_Name_NL;
    private String Airport_Name_TR;
    private String Airport_Name_DK;
    private String Airport_Name_FI;
    private String Airport_Name_NO;
    private String Airport_Name_FL;
    private String Airport_Name_IL;
    private String Airport_Name_PT;
    private Integer top_destination;
    private String destination_airport;
    private String image;
}
