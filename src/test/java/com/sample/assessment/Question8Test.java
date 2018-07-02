package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		assertFalse("The butterfly is expected not to sing", butterfly.sing());
        assertFalse("The butterfly is expected not to swim", butterfly.swim());
        assertFalse("The butterfly is expected not to walk", butterfly.walk());
        assertTrue("The butterfly is expected to fly", butterfly.fly());
	}
}