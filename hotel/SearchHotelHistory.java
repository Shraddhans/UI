package com.vivance.gtw.dao.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "search_hotel_history")
@NoArgsConstructor
@AllArgsConstructor
public class SearchHotelHistory {
    private Integer origin;
    private Integer domain_origin;
    private String search_type;
    private String country;
    private String city;
    private Date check_in;
    private Integer nights;
    private Integer rooms;
    private Integer total_pax;
    private Integer created_by_id;
    private Date created_datetime;
}
