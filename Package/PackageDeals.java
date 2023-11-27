package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_deals")
@NoArgsConstructor
@AllArgsConstructor
public class PackageDeals {
    private Integer deals_id;
    private Integer package_id;
    private String value;
    private String discount;
    private String you_save;
    private String seats;
    private String time;
}
