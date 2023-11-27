package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "employee_module_map")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModuleMap {
    private Integer origin;
    private Integer employee_list_fk;
    private Integer meta_course_list_fk;
    private Integer status;
    private Integer created_by_id;
    private Date created_datetime;
}
