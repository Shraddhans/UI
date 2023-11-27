package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_urls_new")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiUrlsNew {
    private Integer id;
    private SystemEnum system;
    private String urls;
    private Integer status;
}
