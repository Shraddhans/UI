package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "email_configuration")
@NoArgsConstructor
@AllArgsConstructor
public class EmailConfiguration {
    private Integer origin;
    private String username;
    private String password;
    private String from;
    private String host;
    private String port;
    private String cc;
    private String bcc;
    private Integer status;
}
