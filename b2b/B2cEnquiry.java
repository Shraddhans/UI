package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "b2c_enquiry")
public class B2cEnquiry {
    private Integer id;
    private String name;
    private String email;
    private Integer phone;
    private String place;
    private PurposeEnum purpose;
    private Date enq_date;
    private String message;
}
