package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */
public abstract class Animal {
	
	
    protected static final String I_AM_WALKING = " Says I am Walking";
    protected static final String I_AM_SINGING = " Says I am Singing";
    protected static final String I_AM_FLYING = " Says I am Flying";
    protected static final String I_AM_SWIMMING = " Says I am Swimming";
    protected static final String I_AM_SAYING_CLUCK_CLUCK = "Says Cluck, cluck";
    protected static final String I_AM_SAYING_QUACK_QUACK = "Says Quack, quack";
    protected static final String MY_WINGS_CLAPPED = "Says I Cannot fly,  My wings are clipped";
    protected static final String I_CANNOT_SWIM = " Says I Cannot Swim";
    protected static final String I_CANNOT_FLY = " Says I Cannot Fly";
	
	public abstract void fly();

	public abstract void walk();
	
	public abstract void sing();
	
	public abstract void swim();

	public abstract void logMessage(String statement);
}
