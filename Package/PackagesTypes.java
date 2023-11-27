package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "packages_types")
@NoArgsConstructor
@AllArgsConstructor
public class PackagesTypes {
    private Integer packages_types_id;
    private String packages_types_name;
}
