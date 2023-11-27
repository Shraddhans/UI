package com.vivance.gtw.dao.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "car_vehiclesize")
@NoArgsConstructor
@AllArgsConstructor
public class CarVehicleSize {
    private Integer orgin;
    private Integer vehiclesize_id;
    private String vehiclesize_name;
}
