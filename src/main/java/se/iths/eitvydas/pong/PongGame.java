package se.iths.eitvydas.pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PongGame extends JPanel implements MouseMotionListener {
    static final int WINDOW_HEIGHT = 480;
    static final int WINDOW_WIDTH = 640;

    private Ball gameBall;

    private Paddle userPaddle, pcPaddle;

    private int userMouseY, userScore, pcScore;

    public PongGame() {

        gameBall = new Ball(320, 220, 3, 3, 3, Color.WHITE, 10);

        userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);

        pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

        userMouseY = 0;
        addMouseMotionListener(this);

    }

    public void paintComponent(Graphics graphics) {
        //Make Background
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        //Make The Ball
        gameBall.paint(graphics);
        //Paint The Paddle
        userPaddle.paint(graphics);
        pcPaddle.paint(graphics);
        //Score
        graphics.setColor(Color.WHITE);
        graphics.drawString("Score - Player [" + userScore + "]" + " " + "Score - Computer [" + pcScore + "]", 250, 20);

    }

    public void gameLogic() {

        gameBall.bounceOffEdge(0, WINDOW_HEIGHT);

        gameBall.moveBall();

        userPaddle.moveTowards(userMouseY);

        pcPaddle.moveTowards(gameBall.getY());

        if (userPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
        }

        if (pcPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
        }
        if (gameBall.getX() < 0) {
            pcScore++;
        } else if (gameBall.getX() > WINDOW_WIDTH) {
            userScore++;
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        userMouseY = e.getY();

    }
}
