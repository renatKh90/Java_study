package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DonateWindow extends JFrame {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;



    private MainWindow mainWindow;



    DonateWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        setBackground(Color.GREEN);

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Поблагодарить автора");
        Rectangle rectangle = mainWindow.getBounds();
        int posX = (int)rectangle.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int)rectangle.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);


        JPanel panelButton = new JPanel();
        JTextField moneyGift = new JTextField(15);
        add(panelButton, BorderLayout.SOUTH);
        setVisible(true);
        add(new JLabel("Введите сколько денег хотите отправить и нажмите Enter"), BorderLayout.NORTH);
        add(moneyGift, BorderLayout.CENTER);

        moneyGift.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Мне отправили : " + moneyGift.getText() + " рублей");
            }
        });

    }
}