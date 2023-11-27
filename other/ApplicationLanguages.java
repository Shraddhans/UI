package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "application_languages")
@Data
@NoArgsConstructor@AllArgsConstructor
public class ApplicationLanguages {
    private Integer origin;
    private String lable_code;
    private String eng;
    private String arb;
}
