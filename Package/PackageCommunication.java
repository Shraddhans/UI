package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "package_communication")
@NoArgsConstructor
@AllArgsConstructor
public class PackageCommunication {
    private Integer package_communication_id;
    private Integer view_conversation_id;
    private Integer reply_id;
    private Integer usertype;
    private Integer supplier_id;
    private String comments;
    private Date created_date;
    private Integer status;
}
