package com.vivance.gtw.dao.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineList {
    @Id
    @Column(name = "origin")
    private Long origin;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "has_specific_markup")
    private int has_specific_markup;
	public Long getOrigin() {
		return origin;
	}
	public void setOrigin(Long origin) {
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getHas_specific_markup() {
		return has_specific_markup;
	}
	public void setHas_specific_markup(int has_specific_markup) {
		this.has_specific_markup = has_specific_markup;
	}
	
	@Override
	public String toString() {
		return "AirlineList [origin=" + origin + ", name=" + name + ", code=" + code + ", has_specific_markup="
				+ has_specific_markup + "]";
	}
}
