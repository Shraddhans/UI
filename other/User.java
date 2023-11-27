package com.vivance.gtw.dao.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
      private Integer user_id;
      private Integer domain_list_fk;
      private String uuid;
      private Integer user_type;
      private String email;
      private String user_name;
      private String password;
      private Integer status;
      private Date date_of_birth;
      private String image;
      private String title;
      private String agency_name;
      private String agent_name;
      private String first_name;
      private String middle_name;
      private String last_name;
      private String address;
      private String state;
      private Integer city;
      private String pin_code;
      private Integer country_code;
      private Integer country_name;
      private String phone;
      private BigInteger office_phone;
      private String pan_number;
      private String pan_holdername;
      private String gst_file;
      private String gst_number;
      private String pan_file;
      private String business_nature;
      private String address_proof;
      private String iata;
      private Integer total_emp;
      private String sales_person;
      private String no_employees;
      private Integer account_num;
      private String acc_holdername;
      private String ifsc_code;
      private String corporate_id;
      private String branch_id;
      private String manager_id;
      private String booking_status;
      @Enumerated(EnumType.STRING)
      @Column(name = "creation_source")
      private CreationSourceEnum creation_source;
      private Date created_datetime;
      private String annual_transaction;
      private String establishment_date;
      private Integer created_by_id;
      @Enumerated(EnumType.STRING)
      @Column(name = "language_preference")
      private LanguagePreferenceEnum language_preference;
      private String signature;
      private String BRANCH_USER;
      private String EXECUTIVE_MANAGER;
      private String EMPLOYEE_USER;
      private Integer terms_conditions;
      private String pan_no;
      private String gst_no;
      private String panimage;
      private String gstimage;
      private String prf_country;
      private String prf_billing_address1;
      private String prf_billing_address2;
      private String prf_state;
      private String prf_city;
      private String prf_zipcode;
      private String pwd_token;
      private Integer email_activation;
}

