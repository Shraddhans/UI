package com.vivance.gtw.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viv_session")
public class AmadeusSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition="TEXT")
    private String request_token;
    @Column(columnDefinition="TEXT")
    private String request_search_details;
    @Column(columnDefinition="TEXT")
    private String encrypted_session_info;
    @Column(name="session_start_time")
    private Timestamp session_start_time;
    @Column(name="session_expiry_time")
    private Timestamp session_expiry_time;
    @Column(columnDefinition="TEXT")
    private String  ip_address;
    @Column(columnDefinition="TEXT")
    private String  device;
    @Column(columnDefinition="TEXT")
    private String  browser;
    @Column (columnDefinition="TEXT")
    private String vivanceSession;
    @Column(columnDefinition = "TEXT")
    private String sequence_number;



    public AmadeusSession() {
    }

    public AmadeusSession(Integer id, String request_token, String request_search_details, String encrypted_session_info, Timestamp session_start_time, Timestamp session_expiry_time, String ip_address, String device, String browser, String vivanceSession, String sequence_number) {
        this.id = id;
        this.request_token = request_token;
        this.request_search_details = request_search_details;
        this.encrypted_session_info = encrypted_session_info;
        this.session_start_time = session_start_time;
        this.session_expiry_time = session_expiry_time;
        this.ip_address = ip_address;
        this.device = device;
        this.browser = browser;
        this.vivanceSession = vivanceSession;
        this.sequence_number = sequence_number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequest_token() {
        return request_token;
    }

    public void setRequest_token(String request_token) {
        this.request_token = request_token;
    }

    public String getEncrypted_session_info() {
        return encrypted_session_info;
    }

    public void setEncrypted_session_info(String encrypted_session_info) {
        this.encrypted_session_info = encrypted_session_info;
    }

    public Timestamp getSession_start_time() {
        return session_start_time;
    }

    public void setSession_start_time(Timestamp session_start_time) {
        this.session_start_time = session_start_time;
    }

    public Timestamp getSession_expiry_time() {
        return session_expiry_time;
    }

    public void setSession_expiry_time(Timestamp session_expiry_time) {
        this.session_expiry_time = session_expiry_time;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getVivanceSession() {
        return vivanceSession;
    }

    public void setVivanceSession(String vivanceSession) {
        this.vivanceSession = vivanceSession;
    }

    public String getSequence_number() {
        return sequence_number;
    }

    public void setSequence_number(String sequence_number) {
        this.sequence_number = sequence_number;
    }
    public String getRequest_search_details() {
        return request_search_details;
    }

    public void setRequest_search_details(String request_search_details) {
        this.request_search_details = request_search_details;
    }
    @Override
    public String toString() {
        return "AmadeusSession{" +
                "id=" + id +
                ", request_token='" + "********" + request_token.substring(request_token.length()-4) + '\'' +
                ", request_search_details='" + request_search_details + '\'' +
                ", encrypted_session_info='" + "********" + encrypted_session_info.substring(encrypted_session_info.length()-4) + '\'' +
                ", session_start_time=" + session_start_time +
                ", session_expiry_time=" + session_expiry_time +
                ", ip_address='" + ip_address + '\'' +
                ", device='" + device + '\'' +
                ", browser='" + browser + '\'' +
                ", vivanceSession='" + vivanceSession + '\'' +
                ", sequenceNumber=" + sequence_number +
                '}';
    }
}
