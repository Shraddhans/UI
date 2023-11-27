package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "active_modules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiveModules {
    private Integer origin;
    private String module;
    private Integer status;

}
