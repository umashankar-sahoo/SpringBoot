package com.cavendish.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cavendish.main.SpringBootRestApiApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { SpringBootRestApiApp.class })
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println();
		assertEquals(1, 1);
	}

}
 