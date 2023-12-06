package com.sergiosanpol.forsale.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sergiosanpol.forsale.hattrickdata.output.dto.HattrickData;

@RestController
@RequestMapping("/prueba")
public class ControllerTest {
	
	private XmlMapper mapper;
	
	public ControllerTest (XmlMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping(value = "/metodo", produces = MediaType.APPLICATION_XML_VALUE)
	public HattrickData prueba() throws IOException {
		return mapper.readValue(new File("src/test/prueba.xml"), HattrickData.class);
	}

}
