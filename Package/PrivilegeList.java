package com.vivance.gtw.dao.Package;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name  = "privilege_list")
public class PrivilegeList {
    private Integer origin;
    private PrivilegeCategoryEnum privilege_category;
    private String privilege_key;
    private String description;
}
