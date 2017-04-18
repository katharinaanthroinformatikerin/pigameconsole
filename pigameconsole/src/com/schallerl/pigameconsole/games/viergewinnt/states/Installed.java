package com.schallerl.pigameconsole.games.viergewinnt.states;

import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;
import com.schallerl.pigameconsole.games.viergewinnt.states.GameReady;

/**
 * Created by Katharina on 17.04.2017.
 */
public class Installed implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'Installed'.");
        //implement callback:
        vg.setGameState(new GameReady());
    }
}
