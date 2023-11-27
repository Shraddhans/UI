package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_sightseeing_destination_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiSightseeingDestinationList {
    private Integer origin;
    private String destination_name;
    private Integer destination_id;
    private String destination_type;
    private String timeZone;
    private String iataCode;
    private Float lat;
    private Float lng;
}
