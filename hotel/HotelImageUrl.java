package com.vivance.gtw.dao.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "hotel_image_url")
@NoArgsConstructor
@AllArgsConstructor
public class HotelImageUrl {
    private Integer origin;
    private String search_id;
    private String image_url;
    private Integer ResultIndex;
    private String hotel_code;
}
