package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "timeline_master_event")
@NoArgsConstructor
@AllArgsConstructor
public class TimelineMasterEvent {
    private String origin;
    private String event_title;
    private String event_icon;
}
