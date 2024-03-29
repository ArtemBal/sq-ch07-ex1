package com.example.sqch07ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MainTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Test /home page can be successfully called")
	void testRequestAndContent() throws Exception{
		mockMvc.perform(get("/home")).andExpect(status().isOk());
	}

}
