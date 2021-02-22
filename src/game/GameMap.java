package game;

import javax.swing.*;
import java.awt.*;


public class GameMap extends JPanel {

    public static final int GAME_MODE_HUMAN_VS_HUMAN = 0;
    public static final int GAME_MODE_HUMAN_VS_AI = 1;

    GameMap() {
        setBackground(Color.ORANGE);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("mode = " + gameMode +
                " fieldSizeX = " + fieldSizeX +
                " fieldSizeY = " + fieldSizeY +
                " winLength = " + winLength);
    }


/*
1. Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
2. Составить список вопросов и приложить в виде комментария к домашней работе
 */
}
