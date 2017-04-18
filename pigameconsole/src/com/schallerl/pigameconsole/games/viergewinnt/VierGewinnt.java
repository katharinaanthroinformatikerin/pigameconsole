package com.schallerl.pigameconsole.games.viergewinnt;
import com.schallerl.pigameconsole.games.viergewinnt.states.*;
import com.schallerl.pigameconsole.games.viergewinnt.interfaces.*;

/**
 * Created by Katharina on 17.04.2017.
 */
public class VierGewinnt {
    private IGameState gameState;

    public VierGewinnt(){

        gameState = new Installed();
    }

    public void start(){
        while(gameState != null) {
            gameState.execute(this);
        }
    }

    public void setGameState(IGameState newGS){
        gameState = newGS;
    }
}
