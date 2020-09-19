package com.org.project.jackson.object.mapper.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"id"}) // Ignore
@JsonInclude(JsonInclude.Include.NON_NULL) // Ignore null value
public class JsonAnySetterDTO {

//	@JsonIgnore
	Integer id;

	@JsonAlias({"AGE", "aGE", "umar"})
	@JsonProperty("Json Prop Name will display in response")
	Integer age;

	Map<String, String> properties;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	@JsonAnySetter
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@JsonAnySetter
	public void add(String key, String value){
		properties.put(key, value);
	}
}
