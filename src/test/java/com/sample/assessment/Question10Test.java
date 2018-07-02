package com.sample.assessment;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Question10Test {

	Question10 question10;

	@Before
	public void setUp() throws IOException {
		question10 = new Question10();
	}

	@Test
	public void testTotalAnimalsFly() {
		assertEquals("Total Animals to fly", 3, question10.totalAnimalsFly());
	}

	@Test
	public void testTotalAnimalsWalk() {
		assertEquals("Total Animals to fly", 8, question10.totalAnimalsWalk());
	}

	@Test
	public void testTotalAnimalsSing() {
		assertEquals("Total Animals to fly", 8, question10.totalAnimalsSing());
	}

	@Test
	public void testTotalAnimalsSwim() {
		assertEquals("Total Animals to fly", 8, question10.totalAnimalsSwim());
	}
}