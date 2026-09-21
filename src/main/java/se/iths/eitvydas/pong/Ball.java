package se.iths.eitvydas.pong;

import java.awt.*;

public class Ball {

    private int x, y, cx, cy, speed, size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size) {
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;

    }

    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
    }

    public void moveBall() {

        x += cx;
        y += cy;
    }

    public void bounceOffEdge(int top, int bottom) {

        if (y > bottom - size) {
            reverseY();
        }

        if (y < top) {
            reverseY();
        }

        if (x < 0) {
            reverseX();
        }

        if (x > 640 - size) {
            reverseX();
        }

    }

    public void reverseY() {
        cy *= -1;
    }

    private void reverseX() {
        cx *= -1;
    }

}
