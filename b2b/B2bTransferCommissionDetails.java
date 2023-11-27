package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "b2b_transfer_commission_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class B2bTransferCommissionDetails {
    private Integer origin;
    private TypeEnum type;
    private Integer agent_fk;
    private Float value;
    private ValueTypeEnum value_type;
    private Float api_value;
    private Integer domain_list_fk;
    private String commission_currency;
    private Integer created_by_id;
    private Date created_datetime;

}
