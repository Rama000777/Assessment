package com.sample.assessment;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Butterfly;

public class Question8Test {

	Butterfly butterfly;

	@Before
	public void setUp() throws IOException {
		butterfly = new Butterfly();
	}

	@Test
	public void testButterFly() {
		butterfly.sing();
		butterfly.swim();
		butterfly.walk();
		butterfly.fly();
	}
}