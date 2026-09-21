package se.iths.eitvydas.pong;

import javax.swing.*;
import java.awt.*;

public class PongGame extends JPanel {
    static final int WINDOW_HEIGHT = 480;
    static final int WINDOW_WIDTH = 640;

    private Ball gameBall;

    public PongGame() {

        gameBall = new Ball(320, 220, 3, 3, 3, Color.WHITE, 10);

    }

    public void paintComponent(Graphics graphics) {
        //Make Background
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        gameBall.paint(graphics);
    }

}
