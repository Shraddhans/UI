package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "package_booking_transaction_details")
@NoArgsConstructor
@AllArgsConstructor
public class PackageBookingTransactionDetails {
    private Integer origin;
    private String app_reference;
    private String pnr;
    private StatusEnum status;
    private String status_description;
    private String book_id;
    private String source;
    private String ref_id;
    private Float total_fare;
    private String currency;
    private String attributes;
}
