package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "payment_option_list")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentOptionList {
    private Integer origin;
    private String name;
    private String payment_category_code;
    private Integer status;
}
