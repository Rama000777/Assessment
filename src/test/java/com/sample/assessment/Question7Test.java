package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    public void testDolphin() {
    	assertFalse("The dolphin is expected not to sing", dolphin.sing());
        assertTrue("The dolphin is expected swim", dolphin.swim());
        assertFalse("The dolphin is expected not to walk", dolphin.walk());
        assertFalse("The dolphin is expected not to fly", dolphin.fly());
    }
}