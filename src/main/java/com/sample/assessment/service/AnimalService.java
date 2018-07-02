/**
 * AssessmentApplication.java
 */
package com.sample.assessment.service;

import java.util.Arrays;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Ramachandra
 *
 */

@Service
public class AnimalService {

    private static final Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(),
            new Parrot(), new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(),
            new Butterfly(), new Cat(), new CatterPillar() };

    public long totalAnimalsFly() {
        return filterByPredicateAndGetCount(this::countAnimalsFly);
    }

    public long totalAnimalsWalk() {
        return filterByPredicateAndGetCount(this::countAnimalsWalk);
    }

    public long totalAnimalsSing() {
        return filterByPredicateAndGetCount(this::countAnimalsSing);
    }

    public long totalAnimalsSwim() {
        return filterByPredicateAndGetCount(this::countAnimalsSwim);
    }

    private long filterByPredicateAndGetCount(Predicate<Animal> predicate) {
        return Arrays.asList(animals).stream().filter(predicate).count();
    }

    private boolean countAnimalsFly(Animal animal) {
        return animal.fly();
    }

    private boolean countAnimalsWalk(Animal animal) {
        return animal.walk();
    }

    private boolean countAnimalsSing(Animal animal) {
        return animal.sing();
    }

    private boolean countAnimalsSwim(Animal animal) {
        return animal.swim();
    }
}
