package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_continent_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiContinentList {
    private Integer origin;
    private String name;
}
