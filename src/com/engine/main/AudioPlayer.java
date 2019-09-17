/*	
 * This Class handles loading and
 * 	Playing audio
 */

package com.engine.main;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class AudioPlayer {

	// Holds sound effects
	public static Map<String, Sound> soundMap = new HashMap<String, Sound>();
	// Holds music
	public static Map<String, Music> musicMap = new HashMap<String, Music>();

	// Loads audio into the map
	public static void load() {

		try {
			// Insert audio load ex:
			musicMap.put("music", new Music("res/menuMusic.wav"));
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}

	// Stops music "key"
	public static void pause(String key) {
		getMusic(key).stop();
	}

	// Returns music "key"
	public static Music getMusic(String key) {
		return musicMap.get(key);
	}

}
