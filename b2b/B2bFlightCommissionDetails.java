package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "b2b_flight_commission_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class B2bFlightCommissionDetails {
    private int origin;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
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
