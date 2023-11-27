package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "cron_job_logger")
@NoArgsConstructor
@AllArgsConstructor
public class CronJobLogger {
    private Integer origin;
    private String service_method;
    private Date created_datetime;
}
