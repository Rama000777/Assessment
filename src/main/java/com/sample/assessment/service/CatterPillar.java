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
    public void fly() {
        logMessage(I_CANNOT_FLY);
    }

    @Override
    public void sing() {
        logMessage(I_CANNOT_MAKE_SOUND);
    }

    @Override
    public void swim() {
        logMessage(I_CANNOT_SWIM);
    }

    @Override
    public void walk() {
        logMessage(I_CAN_CRAWL);
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }
}
