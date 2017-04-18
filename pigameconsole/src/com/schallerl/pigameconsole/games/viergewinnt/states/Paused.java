package com.schallerl.pigameconsole.games.viergewinnt.states;

import java.util.Scanner;
import com.schallerl.pigameconsole.games.viergewinnt.interfaces.IGameState;
import com.schallerl.pigameconsole.games.viergewinnt.VierGewinnt;

/**
 * Created by Katharina on 18.04.2017.
 */
public class Paused implements IGameState {
    @Override
    public void execute(VierGewinnt vg) {
        System.out.println("Executing 'Paused'. Please press Enter.");
        Scanner scanner = new Scanner(System.in);
        //console wartet auf Input
        String endPause = scanner.nextLine();
        System.out.println("Reached EndedState.");
        vg.setGameState(new EndedState());
    }
}
