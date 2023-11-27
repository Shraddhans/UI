package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "blog")
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private Integer id;
    private String blog_title;
    private String blog_description;
    private String blog_image;
    private Integer page_status;
}
