package ouc.sei.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

import ouc.sei.config.DatabaseConfig;
import ouc.sei.config.MvcConfig;
import ouc.sei.entity.User;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes={DatabaseConfig.class})
public class WaveControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Before
	public void setUp() {
	    mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void foreMaxWaterTemp() throws Exception{
		this.mockMvc
		.perform(post("/wave/foreMaxWaterTemp"))
		.andDo(print());
		
	} 
	
	@Test
	public void seaFore() throws Exception{
		this.mockMvc
		.perform(post("/wave/foreMinWaterTemp"))
		.andDo(print());
		
	} 
	
	@Test
	public void waterAlarm() throws Exception{
		this.mockMvc
		.perform(post("/wave/waterAlarm"))
		.andDo(print());
		
	} 
	
	@Test
	public void warningMaxWater() throws Exception{
		this.mockMvc
		.perform(post("/wave/warningWater"))
		.andDo(print());
		
	} 
}
