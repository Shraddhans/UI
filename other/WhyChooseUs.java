package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "why_choose_us")
@NoArgsConstructor
@AllArgsConstructor
public class WhyChooseUs {
    private Integer origin;
    private String  title;
    private String icon;
    private Integer status;
}
