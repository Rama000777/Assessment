package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */
public abstract class Animal implements IGender {
	
	
    protected static final String I_AM_WALKING = " Says I am Walking";
    protected static final String I_AM_SINGING = " Says I am Singing";
    protected static final String I_AM_FLYING = " Says I am Flying";
    protected static final String I_AM_SWIMMING = " Says I am Swimming";
    protected static final String I_AM_SAYING_CLUCK_CLUCK = "Says Cluck, cluck";
    protected static final String I_AM_SAYING_QUACK_QUACK = "Says Quack, quack";
    protected static final String MY_WINGS_CLAPPED = "Says I Cannot fly,  My wings are clipped";
    protected static final String I_CANNOT_SWIM = " Says I Cannot Swim";
    protected static final String I_CANNOT_FLY = " Says I Cannot Fly";
    protected static final String ROOSTER_SAYS_COOK_A_DOODLE = " Says Cock-a-doodle-doo";
    protected static final String I_AM_SAYING_WOOF = "Says Woof, woof";
    protected static final String I_AM_SAYING_MEOW = "Says Meow";
    protected static final String I_CANNOT_WALK = " Says I Cannot Walk";
    protected static final String I_CANNOT_SING = " Says I Cannot Sing";
    protected static final String LARGE_AND_GREY = " are large and grey";
    protected static final String WE_EAT_OTHER_FISH = " eat other fish ";
    protected static final String SMALL_COLORFUL = " are small and colourful (orange)";
    protected static final String MAKE_JOKES = " make jokes";
    protected static final String THEY_ARE_GOOD_SWIMMERS = " Says They are Good Swimmers ";
    protected static final String I_CANNOT_MAKE_SOUND = " does not make a sound ";
    protected static final String I_CAN_CRAWL = " Says  can walk (crawl) ";
	
	public abstract boolean fly();

	public abstract boolean walk();
	
	public abstract boolean sing();
	
	public abstract boolean swim();

	public abstract void logMessage(String statement);
	
	@Override
    public boolean isMale() {
        return false;
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
