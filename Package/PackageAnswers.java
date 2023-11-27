package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_answers")
@NoArgsConstructor
@AllArgsConstructor
public class PackageAnswers {
    private Integer id;
    private Integer qid;
    private Integer package_id;
    private String ans;
    private Integer user_id;
    private Integer user_type;
    //private StatusEnum status enum('0','1');
}
