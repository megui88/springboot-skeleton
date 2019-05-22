package com.skeleton.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WellcomeControllerTests {
    
	@Autowired
	private WelcomeController controller;
	
	@Test
	public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
	}
}
