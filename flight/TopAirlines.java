package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "top_airlines")
@NoArgsConstructor
@AllArgsConstructor
public class TopAirlines {
    private Integer origin;
    private String airline_name;
    private String logo;
    private String description;
    private Integer status;
    private Date created_datetime;
}
