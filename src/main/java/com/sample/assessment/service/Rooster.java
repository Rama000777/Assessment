/**
 * Rooster.java
 */
package com.sample.assessment.service;

public class Rooster extends Chicken {

	@Override
	public boolean fly() {
		logMessage(I_CANNOT_FLY);
		return false;
	}

	@Override
	public boolean sing() {
		logMessage(ROOSTER_SAYS_COOK_A_DOODLE);
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
