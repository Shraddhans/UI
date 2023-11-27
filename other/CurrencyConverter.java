package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "currency_converter")
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConverter {
    private Integer id;
    private Integer status;
    private String country;
    private Double value;
    private String currency_symbol;
    private String currency_icon;
    private Date date_time;
}
