package com.sample.assessment.service;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * 
 * @author Ramachandra
 *
 */
public class Bird extends Animal {
	public void fly() {
		logMessage("I am flying");
	}

	public void sing() {
		logMessage("I am singing");

	}

	@Override
	public void walk() {
		logMessage("I am walking");
	}

	@Override
	public void logMessage(String statement) {
		System.out.println(this.getClass().getSimpleName() + " Says " + statement);

	}
}
