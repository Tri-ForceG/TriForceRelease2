package com.triforce_release2;

import com.badlogic.gdx.Game;
import com.triforce_release2.States.MainMenuState;
import com.triforce_release2.States.PlayState;

public class TriForceRelease2 extends Game {

	MainMenuState mainMenuState; //Instances of the other classes to call.
	PlayState playState;

	@Override
	public void create () {
		mainMenuState = new MainMenuState(this);
		playState = new PlayState(this);

		SoundFiles.load(); //Loads the music file in the BackgroundMusic class, and then plays it based on the criteria there.

		setScreen(mainMenuState); //Sets the initial screen to the Main Menu.
	}

	//If you include this render, it will display whatever is here, and not the render in the other classes.
	//@Override
	//public void render () {
	//Gdx.gl.glClearColor(1, 0, 0, 1);
	//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//}
}
