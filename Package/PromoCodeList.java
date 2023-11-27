package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "promo_code_list")
@NoArgsConstructor
@AllArgsConstructor
public class PromoCodeList {
    private Integer origin;
    private ModuleEnum module;
    private String promo_code;
    private String description;
    private Float value;
    private ValueTypeEnum value_type;
    private Date expiry_date;
    private Float minimum_amount;
    private String promo_code_image;
    private DisplayHomePageEnum display_home_page;
    private ShowOnModalEnum show_on_modal;
    private Integer status;
    private Integer created_by_id;
    private Date created_datetime;
}
