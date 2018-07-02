package com.sample.assessment;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Chicken;
import com.sample.assessment.service.Rooster;

public class Question3Test {

    Rooster rooster;

    @Before
    public void setUp() throws IOException {
        rooster = new Rooster();
    }

    @Test
    public void testRooster() {
    	rooster.sing();
    	rooster.swim();
    	rooster.walk();
    	rooster.fly();
    }

    @Test
    public void testIsRoosterRelatedToChicken() {
        assertTrue("Expected the rooster is male chicken", rooster instanceof Chicken && rooster.isMale());
    }
}