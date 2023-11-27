package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "package_enquiry")
@NoArgsConstructor
@AllArgsConstructor
public class PackageEnquiry {
    private Integer id;
    private Integer package_id;
    private Integer user_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String address;
    private Date date;
    private Integer package_type;
    private String package_name;
    private Integer package_duration;
    private String nationality;
    //with_or_without` enum('0','1','') DEFAULT NULL,
    private String package_description;
    private String ip_address;
    private Integer status;
    private String place;
    private String message;
    private String best_time_to_call;
    private String kind_pkg_uwant;
    private String created_by_id;
    private Integer domain_list_fk;
    private Integer utype;
    private String comments;
}
