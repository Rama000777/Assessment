/**
 * Fish.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

public class Fish extends Animal {

    @Override
    public boolean fly() {
        logMessage(I_CANNOT_FLY);
        return false;
    }

    @Override
    public boolean sing() {
        logMessage(I_CANNOT_SING);
        return false;
    }

    @Override
    public boolean swim() {
        logMessage(I_AM_SWIMMING);
        return true;
    }

    @Override
    public boolean walk() {
        logMessage(I_CANNOT_WALK);
        return false;
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }
}
