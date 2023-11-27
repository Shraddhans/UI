package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "test")
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    private Integer origin;
    private String test;
    private String description;
    private Date time;
}
