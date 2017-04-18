package com.schallerl.pigameconsole.games.viergewinnt.states;

import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;

/**
 * Created by Katharina on 17.04.2017.
 */
public class CheckDownloadStatus implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'CheckDownloadStatus'.");
        //TODO: Abfrage, ob gedownloaded (Datei vorhanden) --> a) downloading, b) installing.
        vg.setGameState(new Installed());
    }
}

