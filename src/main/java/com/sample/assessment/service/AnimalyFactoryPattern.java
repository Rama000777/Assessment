/**
 * AnimalyFactoryPattern.java
 */
package com.sample.assessment.service;

import java.util.HashMap;
/**
 * 
 * @author Ramachandra
 *
 */
import java.util.Map;

public class AnimalyFactoryPattern {

	static Map<String, Animal> factory = new HashMap<String, Animal>() {
		private static final long serialVersionUID = 1L;
		{
			put("bird", new Bird());
			put("chicken", new Chicken());
			put("rooster", new Rooster());
			put("duck", new Duck());
			put("parrot", new Parrot());

			put("dog", new Dog());
			put("cat", new Cat());
			
			put("fish", new Fish());
			
			put("shark", new Shark());
			put("clownFish", new Clownfish());

		}
	};

	private AnimalyFactoryPattern() {
		// Default Constructor
	}

	public static Animal getAnimal(String order) {
		return factory.get(order.toLowerCase());
	}
}
