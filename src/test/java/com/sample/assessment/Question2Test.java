package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertTrue("The Duck is expected to sing", duck.sing());
        assertTrue("The Duck is expected swim", duck.swim());
        assertTrue("The Duck is expected to walk", duck.walk());
        assertFalse("The Duck is expected not to fly", duck.fly());
    }

    @Test
    public void testChicken() {
        assertTrue("The chicken is expected to sing", chicken.sing());
        assertFalse("The chicken is expected swim", chicken.swim());
        assertTrue("The chicken is expected to walk", chicken.walk());
        assertFalse("The chicken is expected not to fly", chicken.fly());
    }

}
