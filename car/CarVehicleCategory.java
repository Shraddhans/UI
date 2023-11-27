package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "car_vehiclecategory")
@NoArgsConstructor
@AllArgsConstructor
public class CarVehicleCategory {
    private Integer orgin;
    private Integer vehiclecategory_id;
    private String vehiclecategory_name;
    private String vehiclecategory_code;
}
;