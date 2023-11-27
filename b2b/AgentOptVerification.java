package com.vivance.gtw.dao.b2b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agent_opt_verification")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgentOptVerification {
    private Integer id;
    private String agent_uid;
    private Integer verification_status;
}
