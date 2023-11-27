package com.vivance.gtw.dao.convenience;

import com.vivance.gtw.dao.Package.ModuleEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "gst_master")
public class GstMaster {
    private Integer origin;
    private Float tds;
    private Float gst;
    @Enumerated(EnumType.STRING)
    @Column(name = "module")
    private ModuleEnum module;
    private Integer created_by_id;
    private Date created_date;
    private Date modified_date;
}
