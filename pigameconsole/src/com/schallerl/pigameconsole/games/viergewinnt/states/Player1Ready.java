package com.schallerl.pigameconsole.games.viergewinnt.states;

import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;
import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.states.Player1Input;
/**
 * Created by Katharina on 18.04.2017.
 */
public class Player1Ready implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'Player1ready'.");
        vg.setGameState(new Player1Input());
    }
}
