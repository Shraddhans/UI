package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.convenience.ValueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "specific_markup")
@NoArgsConstructor
@AllArgsConstructor
public class SpecificMarkup {
  private Integer origin;
  @Enumerated(EnumType.STRING)
  @Column(name = "markup_level")
  private MarkupLevelEnum markup_level;
  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private MarkupTypeEnum type;
  @Enumerated(EnumType.STRING)
  @Column(name = "module_type")
  private MarkupModuleTypeEnum module_type;
  private Integer reference_id;
  private Double value;
  @Enumerated(EnumType.STRING)
  @Column(name = "value_type")
  private ValueTypeEnum value_type;
  private Integer domain_list_fk;
  private String markup_currency;
  private Integer user_oid;
  private BigInteger group_fk;
}
