package com.org.project.jackson.object.mapper.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.project.jackson.object.mapper.DTO.JsonAnyGetterDTO;

@RestController
public class JacksonObjectMapperController {

	@PostMapping("/jackson")
	private ResponseEntity<JsonAnyGetterDTO> jacksonAnyGetter(@RequestBody JsonAnyGetterDTO jsonAnyGetterDTO) {
		jsonAnyGetterDTO.setOtherDetails("gender", "male");
		jsonAnyGetterDTO.setOtherDetails("gender1", "male1");
		jsonAnyGetterDTO.setOtherDetails("gender2", "male2");
		return ResponseEntity.ok(jsonAnyGetterDTO);
	}
}
