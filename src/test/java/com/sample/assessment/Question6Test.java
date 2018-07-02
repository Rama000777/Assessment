package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Clownfish;
import com.sample.assessment.service.Shark;

public class Question6Test {

    Shark shark;
    Clownfish clownFish;

    @Before
    public void setUp() throws IOException {
        shark = new Shark();
        clownFish = new Clownfish();
    }

    @Test
    public void testShark() {
    	assertFalse("The shark is expected not to sing", shark.sing());
        assertTrue("The shark is expected swim", shark.swim());
        assertFalse("The shark is expected not to walk", shark.walk());
        assertFalse("The shark is expected not to fly", shark.fly());
    }

    @Test
    public void testSharkFeatures() {
        shark.features();
    }
    
    @Test
    public void testClownFish() {
    	 assertFalse("The clownFish is expected not to sing", clownFish.sing());
         assertTrue("The clownFish is expected swim", clownFish.swim());
         assertFalse("The clownFish is expected not to walk", clownFish.walk());
         assertFalse("The clownFish is expected not to fly", clownFish.fly());
    }

    @Test
    public void testClownFishFeatures() {
    	clownFish.features();
    }

}