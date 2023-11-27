package com.vivance.gtw.dao.convenience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "corporate_promocode")
@NoArgsConstructor
@AllArgsConstructor
public class CorporatePromocode {
    private Integer id;
    private Integer promocode_id;
    private Integer corporate_id;
    private Integer promo_status;
}
