package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "privileges")
@NoArgsConstructor
@AllArgsConstructor
public class Privileges {
    private Integer origin;
    private Integer user_type;
    private Integer user_id;
    private Integer p_no;
}
