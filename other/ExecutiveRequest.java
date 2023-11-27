package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "executive_request")
@NoArgsConstructor
@AllArgsConstructor
public class ExecutiveRequest {
    private Integer id;
    private String search_id;
    private String ref_id;
    private BigInteger requested_id;
    private String book_origin;
    private Integer manager_approval_status;

}
