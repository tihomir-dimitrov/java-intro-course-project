package Blocks;

import sun.applet.Main;

public class Party {
    public void Party()
    {
        if (Main.DEBUG) System.out.println("Попадна на страшен купон и остана с 25 шоколада по-малко");
        gameBoard.getParty().putInParty();
        doublesInARow = 0;
        this.position = Party().POSITION;
    }
    public void endParty()
    {
        if (Main.DEBUG) System.out.println("Защо още си тук купона свърши!");
        board.getParty().partyIsOver();
        partyInARow = 0;
    }
}
