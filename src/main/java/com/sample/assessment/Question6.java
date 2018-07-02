/**
 * Question6.java
 */
package com.sample.assessment;

import com.sample.assessment.service.Clownfish;
import com.sample.assessment.service.Shark;

/**
 * 
 * @author Ramachandra
 *
 */
public class Question6 {
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.sing();
        shark.fly();
        shark.walk();
        shark.swim();
        shark.features();
        
        Clownfish clownfish = new Clownfish();
        clownfish.sing();
        clownfish.fly();
        clownfish.walk();
        clownfish.swim();
        clownfish.features();
    }
}
