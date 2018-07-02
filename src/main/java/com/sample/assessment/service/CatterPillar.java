/**
 * CatterPillar.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

public class CatterPillar extends Butterfly {

    @Override
    public boolean fly() {
        logMessage(I_CANNOT_FLY);
        return false;
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
        logMessage(I_CAN_CRAWL);
        return true;
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }
}
