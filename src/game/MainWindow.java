package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame {

    private static final int WINDOW_WIDTH = 1024;
    private static final int WINDOW_HEIGHT = 764;
    private static final int WINDOW_POS_X = 800;
    private static final int WINDOW_POS_Y = 300;

    private SettingsWindow settingsWindow;
    private GameMap gameMap;
    private DonateWindow donateWindow;

    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setTitle("Игра Крестики-Нолики (MainWindow)");
        setResizable(false);

        settingsWindow = new SettingsWindow(this);
        gameMap = new GameMap();
        donateWindow = new DonateWindow(this);

        JButton btnStart = new JButton("Start New Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        JButton btnExit = new JButton("Exit Game");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnDonate = new JButton("Donate author");
        btnDonate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                donateWindow.setVisible(true);
            }
        });

        JPanel panelButton = new JPanel();


        panelButton.setLayout(new GridLayout(1, 3));
        panelButton.add(btnStart);
        panelButton.add(btnExit);
        panelButton.add(btnDonate);

        add(panelButton, BorderLayout.SOUTH);
        add(gameMap);


        setVisible(true);
    }

    void startGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
    }

}