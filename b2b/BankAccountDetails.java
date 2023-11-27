package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "bank_account_details")
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountDetails {
    private Integer origin;
    private Integer status;
    private String en_account_name;
    private String en_bank_name;
    private String en_branch_name;
    private String bank_icon;
    private String account_number;
    private String ifsc_code;
    private String pan_number;
    private Integer domain_list_fk;
    private Integer created_by_id;
    private Date created_datetime;
    private Integer updated_by_id;
    private Date updated_datetime;
    private Integer usr_type;
}
