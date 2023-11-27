package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "crs_sub_menus")
@NoArgsConstructor
@AllArgsConstructor
public class CrsSubMenus {
    private Integer sub_menu_id;
    private String sub_menu_title;
    private String menu_id;
    private String created_date;
    private String status;
    private Integer content_exist;
}
