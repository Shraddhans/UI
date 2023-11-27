package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airline_contact_numbers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineContactNumbers {
    private Integer origin;
    private String airline_code;
    private String phone_number;
}
