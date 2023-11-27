package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "provab_xml_logger")
@NoArgsConstructor
@AllArgsConstructor
public class ProvabXmlLogger {
    private BigInteger origin;
    private String module;
    private String app_reference;
    private String operation_name;
    private String request;
    private String response;
    private String ip_address;
    private Date created_datetime;
}
