package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_review_images")
@NoArgsConstructor
@AllArgsConstructor
public class PackageReviewImages {
    private Integer rev_id;
    private Integer package_id;
    private Integer review_id;
    private String image;
  //status` enum('0','1') DEFAULT NULL
}
