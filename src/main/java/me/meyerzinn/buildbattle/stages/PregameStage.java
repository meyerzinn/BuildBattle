package me.meyerzinn.buildbattle.stages;

import me.meyerzinn.buildbattle.Game;
import me.meyerzinn.buildbattle.status.GameStatus;

public class PregameStage implements Stage{

	public void beginStage(Game game) {
		game.setGameStatus(GameStatus.PREGAME);
		game.next();
	}
	
}
