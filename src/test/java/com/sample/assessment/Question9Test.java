package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.CatterPillar;

public class Question9Test {

	CatterPillar catterPillar;

	@Before
	public void setUp() throws IOException {
		catterPillar = new CatterPillar();
	}

	@Test
	public void testCaterPillar() {
		assertFalse("The catterPillar is expected not to sing", catterPillar.sing());
        assertFalse("The catterPillar is expected not to swim", catterPillar.swim());
        assertTrue("The catterPillar is expected to walk", catterPillar.walk());
        assertFalse("The catterPillar is expected not to fly", catterPillar.fly());
	}
}