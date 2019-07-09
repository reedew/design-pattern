package client;

import abs.Game;
import conc.Cricket;
import conc.Football;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
