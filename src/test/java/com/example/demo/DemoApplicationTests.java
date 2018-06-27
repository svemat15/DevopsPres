package com.example.demo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		HelloWorldController helloWorld = new HelloWorldController();
		assertTrue("Num 1 is greater than Num 2", helloWorld.isGrater(4, 3));
	}


}
