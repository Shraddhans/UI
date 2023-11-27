package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "privilleges_list_corp")
@NoArgsConstructor
@AllArgsConstructor
public class PrivillegesListCorp {
    private Integer id;
    private Integer privillege_name;
    private Integer parent;
    private Integer parent_id;
    private PrivillegesListStatusEnum status;
    private Date updated_at;
}
