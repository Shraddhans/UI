package com.vivance.gtw.dao.Package;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "page_captions")
@NoArgsConstructor
@AllArgsConstructor
public class PageCaptions {
    private Integer id;
    private String page_name;
    private String caption;
}
