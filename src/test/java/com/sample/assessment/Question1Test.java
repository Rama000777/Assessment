package com.sample.assessment;

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
    	bird.fly();
    }

    @Test
    public void testBirdSing() {
        bird.sing();
    }

    @Test
    public void testBirdWalk() {
        bird.walk();
    }

}
