package com.sample.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sample.assessment.service.Parrot;

public class Question4Test {

    Parrot parrotLivingWithDogs;
    Parrot parrotLivingWithCats;
    Parrot parrotLivingNearRooster;
    Parrot parrotLivingNearDuck;
    Parrot parrotLivingNearPhone;
    Parrot parrot;

    @Before
    public void setUp() throws IOException {
        parrotLivingWithDogs = new Parrot(true, false, false);
        parrotLivingWithCats = new Parrot(false, true, false);
        parrotLivingNearRooster = new Parrot(false, false, true);
        parrotLivingNearDuck = new Parrot(false, false, false, true, false);
        parrotLivingNearPhone = new Parrot(false, false, false, false, true);
        parrot = new Parrot();
    }

    @Test
    public void testParrotLivingWithDogs() {
    	assertTrue("The parrot is expected to sing", parrotLivingWithDogs.sing());
    }

    @Test
    public void testParrotLivingWithCats() {
    	assertTrue("The parrot is expected to sing", parrotLivingWithCats.sing());
    }

    @Test
    public void testParrotLivingNearRooster() {
    	assertTrue("The parrot is expected to sing", parrotLivingNearRooster.sing());
    }

    @Test
    public void testParrotLivingNearDuck() {
    	assertTrue("The parrot is expected to sing", parrotLivingNearDuck.sing());
    }

    @Test
    public void testParrotLivingNearPhone() {
    	assertTrue("The parrot is expected to sing", parrotLivingNearPhone.sing());
    }
    
    @Test
    public void testParrot() {
    	assertTrue("The parrot is expected to sing", parrot.sing());
        assertFalse("The parrot is expected not swim", parrot.swim());
        assertTrue("The parrot is expected to walk", parrot.walk());
        assertTrue("The parrot is expected to fly", parrot.fly());
    }
}