package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "booking_source")
@NoArgsConstructor
@AllArgsConstructor
public class BookingSource {
    private Integer origin;
    private OriginTypeEnum origin_type;
    private Integer booking_engine_status;
    private String source_id;
    private String name;
    private String description;
    private String meta_course_list_id;
    private Integer created_by_id;
    private Date created_datetime;

}
