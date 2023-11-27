package com.vivance.gtw.dao.bus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "search_bus_history")
@AllArgsConstructor
@NoArgsConstructor
public class SearchBusHistory {
    private Integer origin;
    private Integer domain_origin;
    private String search_type;
    private String from_station;
    private String to_station;
    private Integer from_station_id;
    private Integer to_station_id;
    @Enumerated(EnumType.STRING)
    @Column(name = "trip_type")
    private TripTypeEnum trip_type;
    private Date journey_date;
    private Integer created_by_id;
    private Date created_datetime;
}
