package com.schallerl.pigameconsole.games.viergewinnt.states;

import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;

/**
 * Created by Katharina on 17.04.2017.
 */
public class GameReady implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'GameReady'.");
        vg.setGameState(new Player1Ready());
    }
}
