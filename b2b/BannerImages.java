package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "banner_images")
@NoArgsConstructor
@AllArgsConstructor
public class BannerImages {
    private Integer origin;
    private String image;
    private String title;
    private String subtitle;
    private Integer added_by;
    private Integer banner_order;
    private Integer status;
}
