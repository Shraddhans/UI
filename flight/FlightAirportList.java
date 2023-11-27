package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_airport_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightAirportList {
    @Id
    @Column(name = "origin")
    private Long origin;
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "airport_name")
    private String airportName;
    @Column(name = "airport_city")
    private String airportCity;
    @Column(name = "country")
    private String country;
    @Column(name = "top_destination")
    private Integer topDestination;
    @Column(name = "image")
    private String image;
    
	public Long getOrigin() {
		return origin;
	}
	public void setOrigin(Long origin) {
		this.origin = origin;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCity() {
		return airportCity;
	}
	public void setAirportCity(String airportCity) {
		this.airportCity = airportCity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getTopDestination() {
		return topDestination;
	}
	public void setTopDestination(Integer topDestination) {
		this.topDestination = topDestination;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "FlightAirportList [origin=" + origin + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ ", airportCity=" + airportCity + ", country=" + country + ", topDestination=" + topDestination
				+ ", image=" + image + "]";
	}
	
}
