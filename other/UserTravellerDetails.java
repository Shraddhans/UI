package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "user_traveller_details")
@NoArgsConstructor
@AllArgsConstructor
public class UserTravellerDetails {
    private Integer origin;
    private Integer user_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private String email;
    private String passport_user_name;
    private Integer passport_nationality;
    private String passport_expiry_day;
    private String passport_expiry_month;
    private String passport_expiry_year;
    private String passport_number;
    private String passport_issuing_country;
    private Integer created_by_id;
    private Date created_datetime;
    private Integer updated_by_id;
    private Date updated_datetime;

}
