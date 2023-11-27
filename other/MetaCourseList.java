package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.b2b.OriginTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "meta_course_list")
@NoArgsConstructor
@AllArgsConstructor
public class MetaCourseList {
  private Integer origin;
  @Enumerated(EnumType.STRING)
  @Column(name = "origin_type")
  private OriginTypeEnum origin_type;
  private Integer pri;
  private String name;
  private String  description;
  private String course_id;
  private Integer status;
  private Integer created_by_id;
  private Date created_datetime;
}
