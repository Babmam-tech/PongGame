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

}
