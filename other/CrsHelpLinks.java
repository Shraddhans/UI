package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "crs_help_links")
@NoArgsConstructor
@AllArgsConstructor
public class CrsHelpLinks {
    private Integer id;
    private Integer menu_id;
    private Integer sub_menu_id;
}
