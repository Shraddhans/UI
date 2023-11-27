package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_que_ans")
@NoArgsConstructor
@AllArgsConstructor
public class PackageQueAns {
    private Integer que_id;
    private Integer package_id;
    private String question;
    private String answer;
    private Integer user_id;
    private Integer usertype;
    //status` enum('0','1') NOT NULL DEFAULT '0'
}
