package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_other_images")
@NoArgsConstructor
@AllArgsConstructor
public class PackageOtherImages {
    private Integer img_id;
    private Integer package_id;
    private String other_image;
}
