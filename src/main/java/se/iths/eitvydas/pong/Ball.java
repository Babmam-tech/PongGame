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

    }

    public void reverseY() {
        cy *= -1;
    }

    public void reverseX() {
        cx *= -1;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}

