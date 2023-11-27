package com.vivance.gtw.dao.other;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "domain_list")
public class DomainList {
    private Integer origin;
    private Double balance;
    private Integer currency_converter_fk;
    private String domain_name;
    private String domain_ip;
    private String domain_key;
    private String theme_id;
    private String b2b_theme_id;
    private Integer status;
    private String comment;
    private String domain_logo;
    private Integer created_by_id;
    private Date created_datetime;
    private String test_username;
    private String test_password;
    private String live_username;
    private String live_password;
    private String phone;
    private String email;
    private String address;
    private Integer api_country_list_fk;
    private Integer api_city_list_fk;
}
