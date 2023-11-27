package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "package_pre_booking")
@NoArgsConstructor
@AllArgsConstructor
public class PackagePreBooking {
    private Integer id;
    private Integer adult_count;
    private Integer child_count;
    private Integer room_count;
    private Integer package_duration_id;
    private Integer package_id;
    private String  adult_price;
    private String child_price;
    private String total_price;
    private Date from_date;
    private Date to_date;
    private String value;
    private String discount;
    private String you_save;
    private String package_type;
    private Integer package_deal_id;
    private String pre_booking_package_id;
}
