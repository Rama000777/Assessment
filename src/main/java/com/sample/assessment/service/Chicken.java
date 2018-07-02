/**
 * Chicken.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

public class Chicken extends Bird {    

    @Override
    public void fly() {
        logMessage(MY_WINGS_CLAPPED);
    }

    @Override
    public void sing() {
        logMessage(I_AM_SAYING_CLUCK_CLUCK);
    }

    @Override
    public void swim() {
        logMessage(I_CANNOT_SWIM);
    }

    @Override
    public void walk() {
        logMessage(I_AM_WALKING);
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }

}
