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
    public boolean fly() {
        logMessage(MY_WINGS_CLAPPED);
        return false;
    }

    @Override
    public boolean sing() {
        logMessage(I_AM_SAYING_CLUCK_CLUCK);
        return true;
    }

    @Override
    public boolean swim() {
        logMessage(I_CANNOT_SWIM);
        return false;
    }

    @Override
    public boolean walk() {
        logMessage(I_AM_WALKING);
        return true;
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }

}
