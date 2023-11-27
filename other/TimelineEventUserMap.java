package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "timeline_event_user_map")
@NoArgsConstructor
@AllArgsConstructor
public class TimelineEventUserMap {
    private BigInteger origin;
    private BigInteger timeline_fk;
    private Integer user_id;
    private Date viewed_datetime;
}
