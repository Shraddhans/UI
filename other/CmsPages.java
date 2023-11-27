package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "cms_pages")
@NoArgsConstructor
@AllArgsConstructor
public class CmsPages {
    private Integer page_id;
    private String page_title;
    private String page_description;
    private String page_position;
    private String page_keyword;
    private String page_seo_title;
    private String page_seo_keyword;
    private String page_seo_description;
    private String page_label;
    private Integer page_status;
}
