package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_days_list")
@NoArgsConstructor
@AllArgsConstructor
public class PackageDaysList {
    private Integer day_id;
    private Integer package_id;
    private String title;
    private String area;
    private String description;
    private String image;
}
