/**
 * RoosterSoundsByLocale.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

import java.util.HashMap;
import java.util.Map;

public class RoosterSoundsByLocale {

    static Map<String, String> factory = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;
        {
            put("Danish", "kykyliky");
            put("Dutch", "kukeleku");
            put("Finnish", "kukko kiekuu");
            put("French", "cocorico");
            put("German", "kikeriki");

            put("Greek", "kikiriki");

            put("Hebrew", "coo-koo-ri-koo");
            put("Hungarian", "kukuriku");

            put("Italian", "chicchirichi");

            put("Japanese", "ko-ke-kok-ko-o");
            put("Portuguese", "cucurucu");
            put("Russian", "kukareku");
            put("Swedish", "kuckeliku");
            put("Turkish", "kuk-kurri-kuuu");
            put("Urdu", "kuklooku");
            put("English", "Cock-a-doodle-doo");
        }
    };

    private RoosterSoundsByLocale() {
        //Default Constructor
    }

    public static String getRoosterSound(String locale) {
        return factory.get(locale);
    }
}
