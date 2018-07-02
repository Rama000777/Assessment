package com.sample.assessment;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Chicken;
import com.sample.assessment.service.Duck;

public class Question2Test {

    Duck duck;
    Chicken chicken;

    @Before
    public void setUp() throws IOException {
        duck = new Duck();
        chicken = new Chicken();
    }

    @Test
    public void testDuck() {
        duck.sing();
        duck.swim();
        duck.walk();
        duck.fly();
    }

    @Test
    public void testChicken() {
    	chicken.sing();
    	chicken.swim();
    	chicken.walk();
    	chicken.fly();
    }

}
