package com.vivance.gtw.dao.convenience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "convenience_fees_backup")
@NoArgsConstructor
@AllArgsConstructor
public class ConvenienceFeesBackup {
    private Integer origin;
    private ModuleEnum module;
    private Float value;
    private ValueTypeEnum value_type;
    private Integer per_pax;
    private String convenience_fee_currency;
};
