/**
 * Bird.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */
public class Bird extends Animal {

    @Override
    public boolean fly() {
        logMessage(I_AM_FLYING);
        return true;
    }

    @Override
    public boolean sing() {
        logMessage(I_AM_SINGING);
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