package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_cancellation")
@NoArgsConstructor
@AllArgsConstructor
public class PackageCancellation {
    private Integer can_id;
    private Integer package_id;
    private String cancellation_advance;
    private String cancellation_penality;

}
