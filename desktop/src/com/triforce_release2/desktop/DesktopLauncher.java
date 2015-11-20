package com.triforce_release2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.triforce_release2.TriForceRelease2;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TriForceRelease2(), config);
		config.height = 600; //Set the height, width, and title of the screen. Disable the option to make the screen larger.
		config.width = 400;
		config.title = "TriForce Release 2!";
		config.resizable = false;
	}
}
