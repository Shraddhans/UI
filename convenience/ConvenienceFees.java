package com.vivance.gtw.dao.convenience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "convenience_fees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConvenienceFees {
    @Id
    @Column(name = "origin")
    private int origin;
    @Column(name = "module")
    @Enumerated(EnumType.STRING)
    private ModuleEnum module;
    @Column(name = "value")
    private float value;
    @Column(name = "value_type")
    @Enumerated(EnumType.STRING)
    private ValueTypeEnum valueType;
    @Column(name = "per_pax")
    private float perPax;
    @Column(name = "convenience_fee_currency")
    private String convFeeCurrency;
}
