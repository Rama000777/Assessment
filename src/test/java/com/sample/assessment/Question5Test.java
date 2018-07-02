package com.sample.assessment;

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
    	fish.sing();
    	fish.swim();
    	fish.walk();
    	fish.fly();
    }

}