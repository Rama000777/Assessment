package com.sample.assessment;

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
        parrotLivingWithDogs.sing();
    }

    @Test
    public void testParrotLivingWithCats() {
    	parrotLivingWithCats.sing();
    }

    @Test
    public void testParrotLivingNearRooster() {
    	parrotLivingNearRooster.sing();
    }

    @Test
    public void testParrotLivingNearDuck() {
    	parrotLivingNearDuck.sing();
    }

    @Test
    public void testParrotLivingNearPhone() {
    	parrotLivingNearPhone.sing();
    }
    
    @Test
    public void testParrot() {
    	parrot.sing();
    	parrot.swim();
    	parrot.walk();
    	parrot.fly();
    }
}