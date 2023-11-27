package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "temp_cache")
@NoArgsConstructor
@AllArgsConstructor
public class TempCache {
    private Integer origin;
    private Integer domain_list_fk;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TempCacheEnum type;
    private Date data;
    private Date created_datetime;
}
