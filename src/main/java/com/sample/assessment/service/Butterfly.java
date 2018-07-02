/**
 * Butterfly.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */
public class Butterfly extends Animal {

    @Override
    public boolean fly() {
        logMessage(I_AM_FLYING);
        return true;
    }

    @Override
    public boolean sing() {
        logMessage(I_CANNOT_MAKE_SOUND);
        return false;
    }

    @Override
    public boolean swim() {
        logMessage(I_CANNOT_SWIM);
        return false;
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
