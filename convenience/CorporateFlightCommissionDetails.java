package com.vivance.gtw.dao.convenience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "corporate_flight_commission_details")
@NoArgsConstructor
@AllArgsConstructor
public class CorporateFlightCommissionDetails {
    private Integer origin;
    private CorporateCommsionEnum type;
    private Integer agent_fk;
    private Float value;
    private ValueTypeEnum value_type;
    private Float api_value;
    private Integer domain_list_fk;
    private String commission_currency;
    private Integer created_by_id;
    private Date created_datetime;
}
