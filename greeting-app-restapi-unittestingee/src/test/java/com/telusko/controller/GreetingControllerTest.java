package com.telusko.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;
import com.telusko.service.IGreeting;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest 
{
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IGreeting service;
	
	@Test
	@Disabled
	public void testGetGreetings2() throws Exception
	{
		
		//MockObject
		Mockito.when(service.generateGreetings("Kapil")).thenReturn("Good Morning Kapil");
		
		//RequestObject
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/wish2");
		
		ResultActions res = mockMvc.perform(requestBuilder);
		MvcResult result = res.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status=response.getStatus();
		
		assertEquals(200, status);
		
	}
	
	@Test
	public void testAddAlienInfo() throws Exception
	{
		//Mocking
		Mockito.when(service.addAlienInfo(ArgumentMatchers.any())).thenReturn(true);
		
		Alien alien=new Alien(1, "Rohan", "Bengaluru");
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(alien);
		//RequestObject
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/add-alien")
		.contentType(MediaType.APPLICATION_JSON)
		.content(json);
		ResultActions res = mockMvc.perform(requestBuilder);
		MvcResult result = res.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		//tets cases
		
		int status=response.getStatus();
		
		assertEquals(201, status);
		
	}
	

}
