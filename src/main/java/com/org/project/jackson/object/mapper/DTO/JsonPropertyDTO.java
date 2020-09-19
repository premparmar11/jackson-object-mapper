package com.org.project.jackson.object.mapper.DTO;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/*
 * JsonProperty will access first
 * Id will pass in response
 * JsonPropertyOrder will give response in alphabetic Order or described order
 */

@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"id","name","age"})
//@JsonRootName(value = "user")
public class JsonPropertyDTO {

	@JsonProperty(value = "Id",defaultValue = "100")
	private Long id;

	private String name;

	private Long age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonGetter("first_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
}
