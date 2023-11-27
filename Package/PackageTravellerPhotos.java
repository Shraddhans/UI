package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_traveller_photos")
@NoArgsConstructor
@AllArgsConstructor
public class PackageTravellerPhotos {
    private Integer img_id;
    private Integer package_id;
    private String traveller_image;
    private Integer user_id;
    private Integer user_type;
    private Integer status;
    private String photo_description;
}
