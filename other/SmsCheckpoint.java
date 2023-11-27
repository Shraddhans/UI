package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sms_checkpoint")
@NoArgsConstructor
@AllArgsConstructor
public class SmsCheckpoint {
    private String condition;
    private String name;
    private Integer status;
}
