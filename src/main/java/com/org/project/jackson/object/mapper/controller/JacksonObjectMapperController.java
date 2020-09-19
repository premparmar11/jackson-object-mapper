package com.org.project.jackson.object.mapper.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.project.jackson.object.mapper.DTO.JsonAnyGetterDTO;
import com.org.project.jackson.object.mapper.DTO.JsonAnySetterDTO;
import com.org.project.jackson.object.mapper.DTO.JsonPropertyDTO;

@RestController
public class JacksonObjectMapperController {

	@PostMapping("/jackson/jsonAnyGetter")
	private ResponseEntity<JsonAnyGetterDTO> jacksonAnyGetter(@RequestBody JsonAnyGetterDTO jsonAnyGetterDTO) {
		jsonAnyGetterDTO.setOtherDetails("gender", "male");
		jsonAnyGetterDTO.setOtherDetails("gender1", "male1");
		jsonAnyGetterDTO.setOtherDetails("gender2", "male2");
		return ResponseEntity.ok(jsonAnyGetterDTO);
	}

	@PostMapping("/jackson/jsonProperty")
	private ResponseEntity<JsonPropertyDTO> jacksonAnyGetter(@RequestBody JsonPropertyDTO jsonPropertyDTO) {
		JsonPropertyDTO abc = new JsonPropertyDTO();
		abc.setId(111L);
		abc.setAge(21L);
		abc.setName("aldkjaslkdjsajdklsjd");
		return ResponseEntity.ok(abc);
	}

	@PostMapping("/jackson/jsonAnySetter")
	private ResponseEntity<JsonAnySetterDTO> jacksonAnyGetter(@RequestBody JsonAnySetterDTO jsonAnySetterDTO) {
		return ResponseEntity.ok(jsonAnySetterDTO);
	}
}
