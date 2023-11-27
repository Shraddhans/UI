package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_rating")
@NoArgsConstructor
@AllArgsConstructor
public class PackageRating {
    private Integer id;
    private Integer package_id;
    private Integer rating;
}
