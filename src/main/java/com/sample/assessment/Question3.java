/**
 * Question3.java
 */
package com.sample.assessment;

import com.sample.assessment.service.Chicken;
import com.sample.assessment.service.Rooster;

/**
 * 
 * @author Ramachandra
 *
 */
public class Question3 {
    public static void main(String[] args) {
        Rooster rooster = new Rooster();
        rooster.sing();
        rooster.fly();
        rooster.walk();

        if (rooster instanceof Chicken && rooster.isMale()) {
            System.out.println("Iam Male Chicken");
        }

    }
}
