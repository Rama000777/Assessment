/**
 * Rooster.java
 */
package com.sample.assessment.service;

import java.util.Locale;

public class Rooster extends Chicken {

	@Override
	public boolean fly() {
		logMessage(I_CANNOT_FLY);
		return false;
	}

	@Override
	public boolean sing() {
		logMessage(" Says "+ getLocaleRoosterSound());
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
	
	public String getLocaleRoosterSound() {
        Locale locale = Locale.getDefault();
        return RoosterSoundsByLocale.getRoosterSound(locale.getDisplayLanguage());
    }
}
