package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "travelport_price_xml")
@NoArgsConstructor
@AllArgsConstructor
public class TravelportPriceXml {
    private Integer origin;
    private String price_xml;
    private Integer serach_id;
    private Date created_date;
}
