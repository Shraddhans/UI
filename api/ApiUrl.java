package com.vivance.gtw.dao.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "api_url")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiUrl {
    private Integer origin;
    private String url;
    private String client_type;
    private String method;
    private String Type;
    private Integer api_fk;
    @Enumerated(EnumType.STRING)
    @Column(name = "url_type")
    private UrlTypeEnum url_type;
}
