package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "b2b_user_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class B2bUserDetails {
    private Integer origin;
    private Integer user_oid;
    private Double balance;
    private Double credit_limit;
    private Double due_amount;
    private Integer currency_converter_fk;
    private String logo;
    private Date created_datetime;
    private Integer created_by_id;
    private Date updated_datetime;
    private Integer updated_by_id;
    private String attr;
}
