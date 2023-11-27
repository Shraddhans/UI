package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private Integer country_id;
    private String name;
    private String phonecode;
}
