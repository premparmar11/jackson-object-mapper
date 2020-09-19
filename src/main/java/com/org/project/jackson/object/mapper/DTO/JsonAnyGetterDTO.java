package com.org.project.jackson.object.mapper.DTO;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/*
 * @JsonAnyGetter converts => json to object
 *
 * for getting o/p from
 * otherDetails : {
 * "age" : 21
 * }
 *
 * like
 * "age" : 21
 */
public class JsonAnyGetterDTO {

	private Long				id;

	private String				name;

	private String				gender;

	private Map<String, String>	otherDetails = new HashMap<>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonAnyGetter
	public Map<String, String> getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(Map<String, String> otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setOtherDetails(String key, String value) {
		this.otherDetails.put(key, value);
	}
}
