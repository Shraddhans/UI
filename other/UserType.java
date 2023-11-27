package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user_type")
@NoArgsConstructor
@AllArgsConstructor
public class UserType {
    private Integer origin;
    private String user_type;
    private String description;
}
