package com.sample.assessment;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Dolphin;

public class Question7Test {

    Dolphin dolphin;

    @Before
    public void setUp() throws IOException {
        dolphin = new Dolphin();
    }

    @Test
    public void testRooster() {
    	dolphin.sing();
    	dolphin.swim();
    	dolphin.walk();
    	dolphin.fly();
    }
}