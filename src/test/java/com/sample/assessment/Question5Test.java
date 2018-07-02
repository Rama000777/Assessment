package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Fish;

public class Question5Test {

    Fish fish;

    @Before
    public void setUp() throws IOException {
        fish = new Fish();
    }

    @Test
    public void testFish() {
    	assertFalse("The fish is expected not to sing", fish.sing());
        assertTrue("The fish is expected swim", fish.swim());
        assertFalse("The fish is expected not to walk", fish.walk());
        assertFalse("The fish is expected not to fly", fish.fly());
    }

}