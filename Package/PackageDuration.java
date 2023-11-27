package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name  = "package_duration")
@AllArgsConstructor
@NoArgsConstructor
public class PackageDuration {
    private Integer dur_id;
    private Integer package_id;
    private String from_date;
    private String to_date;
    private String adult_price;
    private String child_price;
    private String duration;
    private String price;
}
