package com.sample.product.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
	 @Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void testGetUserCorrectResponse() throws Exception {
	        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/user"))
	               .andExpect(MockMvcResultMatchers.status().isOk())
	               .andExpect(MockMvcResultMatchers.content().string("Hi I'm using Jenkins"));
	    }
	    @Test
	    public void testIncorrectUrl() throws Exception {
	        mockMvc.perform(MockMvcRequestBuilders.get("/api"))
	               .andExpect(MockMvcResultMatchers.status().isNotFound());
	    }

}
