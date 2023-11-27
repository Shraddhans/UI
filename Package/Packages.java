package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "packages")
@NoArgsConstructor
@AllArgsConstructor
public class Packages {
    private Integer package_id;
    private String  package_type;
    private String package_cityid;
    private String package_name;
    private Integer max_passanger;
    private String image;
    private Integer package_rating;
    private String package_description;
    private String additional_info;
    private Integer duration;
    private Integer package_price;
    private Integer package_cancellation_days;
    private Integer package_cancellation_percentage;
    private String cancel_policy;
    private String package_terms;
    private String package_voucher;
    private Integer status;
    private Integer domain_list_fk;
}
