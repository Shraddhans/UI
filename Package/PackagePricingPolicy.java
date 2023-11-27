package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_pricing_policy")
@NoArgsConstructor
@AllArgsConstructor
public class PackagePricingPolicy {
    private Integer price_id;
    private Integer package_id;
    private String price_includes;
    private String price_excludes;

}
