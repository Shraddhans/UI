package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_types")
@NoArgsConstructor
@AllArgsConstructor
public class PackageTypes {
    private Integer package_types_id;
    private String package_types_name;
    private Integer domain_list_fk;
}
