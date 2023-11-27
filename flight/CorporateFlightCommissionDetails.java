package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "corporate_flight_commission_details")
@NoArgsConstructor
@AllArgsConstructor
public class CorporateFlightCommissionDetails {
    private Integer origin;
    private TypeEnum type;
    private Integer agent_fk;
    private Float value;
    @Enumerated(EnumType.STRING)
    @Column(name = "value_type")
    private ValueTypeEnum value_type;
    private Float api_value;
    private Integer domain_list_fk;
    private String commission_currency;
    private Integer created_by_id;
    private Date created_datetime;
}
