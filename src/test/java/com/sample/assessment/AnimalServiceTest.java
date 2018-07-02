package com.sample.assessment;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.AnimalService;

public class AnimalServiceTest {

	AnimalService animalService;

	@Before
	public void setUp() throws IOException {
		animalService = new AnimalService();
	}

	@Test
	public void testTotalAnimalsFly() {
		assertEquals("Total Animals to fly", 3, animalService.totalAnimalsFly());
	}

	@Test
	public void testTotalAnimalsWalk() {
		assertEquals("Total Animals to fly", 8, animalService.totalAnimalsWalk());
	}

	@Test
	public void testTotalAnimalsSing() {
		assertEquals("Total Animals to fly", 8, animalService.totalAnimalsSing());
	}

	@Test
	public void testTotalAnimalsSwim() {
		assertEquals("Total Animals to fly", 8, animalService.totalAnimalsSwim());
	}
}