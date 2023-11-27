package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "social_links")
@NoArgsConstructor
@AllArgsConstructor
public class SocialLinks {
    private Integer origin;
    private String social;
    private String url_link;
    private Integer status;
}
