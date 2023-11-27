package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "email_subscribtion")
@NoArgsConstructor
@AllArgsConstructor
public class EmailSubscribtion {

    private Integer id;
    private String email_id;
    private Integer domain_list_fk;
    //private status
    private Date subscribed_date;
}
