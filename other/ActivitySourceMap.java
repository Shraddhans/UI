package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.convenience.ActivityStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "activity_source_map")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivitySourceMap {
    private Integer origin;
    private Integer domain_origin;
    private Integer meta_course_list_fk;
    private Integer booking_source_fk;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    ActivityStatusEnum status;
}
