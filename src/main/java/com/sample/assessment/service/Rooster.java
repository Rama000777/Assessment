/**
 * Rooster.java
 */
package com.sample.assessment.service;

public class Rooster extends Chicken {

	@Override
	public void fly() {
		logMessage(I_CANNOT_FLY);
	}

	@Override
	public void sing() {
		logMessage(ROOSTER_SAYS_COOK_A_DOODLE);
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
    public boolean isMale() {
        return true;
    }

    @Override
    public boolean isFemale() {
        return false;
    }

    @Override
    public boolean isYoung() {
        return false;
    }

}
