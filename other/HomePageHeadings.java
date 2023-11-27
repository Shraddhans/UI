package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "home_page_headings")
@NoArgsConstructor
@AllArgsConstructor
public class HomePageHeadings {
    private Integer origin;
    private String title;
    private String status;
}
