package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_itinerary")
@NoArgsConstructor
@AllArgsConstructor
public class PackageItinerary {
    private Integer iti_id;
    private Integer package_id;
    private String day;
    private Integer package_city;
    private String place;
    private String itinerary_description;
    private String itinerary_image;
    private String itinerary_link;

}
