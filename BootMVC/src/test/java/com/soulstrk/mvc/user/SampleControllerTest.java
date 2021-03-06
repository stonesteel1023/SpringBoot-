package com.soulstrk.mvc.user;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.gargoylesoftware.htmlunit.WebClient;
import com.soulstrk.mvc.Tem.SampleController;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {
	
/*	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {
		// 요청 : "/"
		// 응답
		// - 모델 name : keesun
		// - 뷰 이름 : hello
		
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(view().name("hello"))
				.andExpect(model().attribute("name", is("keesun")))
				.andExpect(content().string(containsString("keesun")));
	}*/
	
}










