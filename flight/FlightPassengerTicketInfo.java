package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "flight_passenger_ticket_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightPassengerTicketInfo {
    private Integer origin;
    private Integer passenger_fk;
    private BigInteger api_passenger_origin;
    private String TicketId;
    private String TicketNumber;
    private Date IssueDate;
    private String Fare;
    private String SegmentAdditionalInfo;
    private String ValidatingAirline;
    private String CorporateCode;
    private String TourCode;
    private String Endorsement;
    private String Remarks;
    private String ServiceFeeDisplayType;
}
