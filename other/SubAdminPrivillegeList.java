package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "sub_admin_privillege_list")
@NoArgsConstructor
@AllArgsConstructor
public class SubAdminPrivillegeList {
    private Integer uid;
    private String privilleges;
    private Date updated_at;
}
