package se.iths.eitvydas.pong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame f = new JFrame("Pong");

    public static void main(String[] args) {

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        f.setSize(650, 515);

        PongGame game = new PongGame();

        f.add(game);

        //Show that window
        f.setVisible(true);

        Timer Timer = new Timer(33, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.repaint();
                game.gameLogic();

            }
        });

        Timer.start();
    }
}
