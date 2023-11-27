package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "activity_category_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityCategoryList {
    private Integer origin;
    private String category_name;
    private String category_url_name;
    private Integer category_id;
}
