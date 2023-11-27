package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "newsletter")
@NoArgsConstructor
@AllArgsConstructor
public class Newsletter {
    private Integer origin;
    private String email;
    private Date registertime;
}
