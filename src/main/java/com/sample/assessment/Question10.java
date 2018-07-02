/**
 * Question10.java
 */
package com.sample.assessment;

import java.util.Arrays;
import java.util.function.Predicate;

import com.sample.assessment.service.Animal;
import com.sample.assessment.service.Bird;
import com.sample.assessment.service.Butterfly;
import com.sample.assessment.service.Cat;
import com.sample.assessment.service.CatterPillar;
import com.sample.assessment.service.Chicken;
import com.sample.assessment.service.Clownfish;
import com.sample.assessment.service.Dog;
import com.sample.assessment.service.Dolphin;
import com.sample.assessment.service.Duck;
import com.sample.assessment.service.Fish;
import com.sample.assessment.service.Frog;
import com.sample.assessment.service.Parrot;
import com.sample.assessment.service.Rooster;
import com.sample.assessment.service.Shark;

/**
 * 
 * @author Ramachandra
 *
 */

public class Question10 {

    private static final Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(),
            new Parrot(), new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(),
            new Butterfly(), new Cat(), new CatterPillar() };

    public static void main(String[] args) {
        new Question10().statitcsOfAnimals();
    }

    public void statitcsOfAnimals() {
        long totalAnimalsFly = totalAnimalsFly();
        long totalAnimalsWalk = totalAnimalsWalk();
        long totalAnimalsSing = totalAnimalsSing();
        long totalAnimalsSwim = totalAnimalsSwim();
        System.out.println("Total Animals that will fly  : " + totalAnimalsFly);
        System.out.println("Total Animals that will walk : " + totalAnimalsWalk);
        System.out.println("Total Animals that will sing : " + totalAnimalsSing);
        System.out.println("Total Animals that will swim : " + totalAnimalsSwim);
    }

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
