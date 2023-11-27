package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "exception_logger")
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionLogger {
    private Integer origin;
    private Integer domain_origin;
    private String exception_id;
    private String module;
    private String op;
    private String notification;
    private String user_agent;
    private String user_ip;
    private String client_info;
    private Date created_datetime;
}
