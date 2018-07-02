package com.sample.assessment;

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
    	shark.sing();
    	shark.swim();
    	shark.walk();
    	shark.fly();
    }

    @Test
    public void testSharkFeatures() {
        shark.features();
    }
    
    @Test
    public void testClownFish() {
    	clownFish.sing();
    	clownFish.swim();
    	clownFish.walk();
    	clownFish.fly();
    }

    @Test
    public void testClownFishFeatures() {
    	clownFish.features();
    }

}