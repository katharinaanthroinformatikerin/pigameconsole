package com.schallerl.pigameconsole.games.viergewinnt.states;

import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;
/**
 * Created by Katharina on 18.04.2017.
 */
public class Player1Input implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'Player1Input'.");
        vg.setGameState(new Paused());
    }
}
