package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tour_styles")
@NoArgsConstructor
@AllArgsConstructor
public class TourStyles {
    private Integer origin;
    private String destination_name;
    private Integer destination_id;
    private String category_name;
    private Integer category_id;
    private String image;
    private Integer status;
}
