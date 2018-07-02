/**
 * Question4.java
 */
package com.sample.assessment;

import java.util.ArrayList;
import java.util.List;

import com.sample.assessment.service.Animal;
import com.sample.assessment.service.Parrot;

/**
 * 
 * @author Ramachandra
 *
 */
public class Question4 {
    public static void main(String[] args) {
        Parrot parrotLivingWithDogs = new Parrot(true, false, false);
        Parrot parrotLivingWithCats = new Parrot(false, true, false);
        Parrot parrotLivingNearRooster = new Parrot(false, false, true);
        Parrot parrotLivingNearDuck = new Parrot(false, false, false, true, false);
        Parrot parrotLivingNearPhone = new Parrot(false, false, false, false, true);
        
        List<Animal> parrots = new ArrayList<>();
        parrots.add(parrotLivingWithDogs);
        parrots.add(parrotLivingWithCats);
        parrots.add(parrotLivingNearRooster);
        parrots.add(parrotLivingNearDuck);
        parrots.add(parrotLivingNearPhone);
        
        parrots.stream().forEach(Animal::sing);

    }
}
