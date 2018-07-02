/**
 * Question2.java
 */
package com.sample.assessment;

import com.sample.assessment.service.Chicken;
import com.sample.assessment.service.Duck;

/**
 * 
 * @author Ramachandra
 *
 */
public class Question2 {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        chicken.sing();
        chicken.fly();
        chicken.walk();
        
        System.out.println("\n");

        Duck duck = new Duck();
        duck.sing();
        duck.swim();
        duck.walk();
        duck.fly();
    }
}