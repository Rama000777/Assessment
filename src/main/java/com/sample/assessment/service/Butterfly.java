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
	public void fly() {
		logMessage(I_AM_FLYING);
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
		logMessage(I_CANNOT_WALK);
	}

	@Override
	public void logMessage(String statement) {
		System.out.println(this.getClass().getSimpleName() + statement);
	}
}
