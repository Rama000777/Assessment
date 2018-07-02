package com.sample.assessment;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Bird;

public class Question1Test {

    Bird bird;

    @Before
    public void setUp() throws IOException {
        bird = new Bird();
    }

    @Test
    public void testBird() {
        bird.walk();
        bird.fly();
        bird.sing();
    }

    @Test
    public void testBirdFly() {
        assertTrue("The Bird is expected to fly", bird.fly());
    }

    @Test
    public void testBirdSing() {
        assertTrue("The Bird is expected to Sing", bird.sing());
    }

    @Test
    public void testBirdWalk() {
        assertTrue("The Bird is expected to Walk", bird.walk());
    }

}
