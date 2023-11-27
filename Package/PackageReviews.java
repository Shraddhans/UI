package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_reviews")
@NoArgsConstructor
@AllArgsConstructor
public class PackageReviews {
    private Integer review_id;
    private Integer package_id;
    private String name;
    private String email_id;
    private String title;
    private String review_description;
    private String review_link;
    private Integer rating;
    private String ipaddress;
    private Integer user_id;
    private Integer usertype;
    private String timestamp;
    //status` enum('0','1') NOT NULL DEFAULT '0'
}
