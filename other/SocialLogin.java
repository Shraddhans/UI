package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "social_login")
@NoArgsConstructor
@AllArgsConstructor
public class SocialLogin {
    private Integer origin;
    private String social_login_name;
    private Integer status;
    private String config;
    private Integer domain_origin;
}
