package com.vivance.gtw.dao.convenience;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "corporate_user_details")
public class CorporateUserDetails {
    private Integer origin;
    private BigInteger user_oid;
    private Double balance;
    private Integer credit_limit;
    private Integer due_amount;
    private Integer curr;
    private String logo;
    private Date created_datetime;
    private Integer created_by_id;
    private Date updated_datetime;
    private Integer updated_by_id;
    private String attr;

}
