package com.vivance.gtw.dao.other;

import com.vivance.gtw.dao.car.TitleEnum;
import com.vivance.gtw.dao.convenience.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "transferv1_booking_pax_details")
@NoArgsConstructor
@AllArgsConstructor
public class Transferv1BookingPaxDetails {
      private Integer origin;
      private String app_reference;
      @Enumerated(EnumType.STRING)
      @Column(name = "title")
      private TitleEnum title;
      private String first_name;
      private String middle_name;
      private String last_name;
      private BigInteger phone;
      private String email;
      @Enumerated(EnumType.STRING)
      @Column(name = "pax_type")
      private PaxDetailsTypeEnum pax_type;
      private Integer age;
      private Date date_of_birth;
      @Enumerated(EnumType.STRING)
      @Column(name = "status")
      private StatusEnum status;
      private String attributes;
}
