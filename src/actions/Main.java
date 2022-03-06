package actions;

import Game.GM;
import Game.GameClock;
import Gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui g = new Gui();
        GM gm = new GM();
        GameClock gc = new GameClock();
        gm.setup();
        g.create();
        gc.start();
    }
}
