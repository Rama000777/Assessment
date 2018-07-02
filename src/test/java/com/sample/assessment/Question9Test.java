package com.sample.assessment;

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
		catterPillar.sing();
		catterPillar.swim();
		catterPillar.walk();
		catterPillar.fly();
	}
}