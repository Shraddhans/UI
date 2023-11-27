package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.b2b.TypeEnum;
import com.vivance.gtw.dao.b2b.ValueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "markup_list")
@NoArgsConstructor
@AllArgsConstructor
public class MarkupList {
  private Integer origin;
  @Enumerated(EnumType.STRING)
  @Column(name = "markup_level")
  private MarkupLevelEnum markup_level;
  private TypeEnum type;
  @Enumerated(EnumType.STRING)
  @Column(name = "module_type")
  private ModuleTypeEnum module_type;
  private Integer reference_id;
  private Float value;
  @Enumerated(EnumType.STRING)
  @Column(name = "value_type")
  private ValueTypeEnum value_type;
  private Integer domain_list_fk;
  private String markup_currency;
  private Integer user_oid;
}
