package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "package")
@NoArgsConstructor
@AllArgsConstructor
public class Package {
    private Integer package_id;
    private String package_code;
    private Integer supplier_id;
    private String tour_types;
    private String package_name;
    private String package_tour_code;
    private Integer duration;
    private String package_description;
    private String image;
    private String package_country;
    private String package_state;
    private String package_location;
    private String package_city;
    private Integer package_type;
    private Integer price_includes;
    private DealsEnum deals;
    private Integer no_que;
    private Integer home_page;
    private Integer rating;
    private Integer status;
    private String price;
    private String display;
    private Integer domain_list_fk;
    private Integer top_destination;
    private Date last_updated;
    private String url_link;

}
