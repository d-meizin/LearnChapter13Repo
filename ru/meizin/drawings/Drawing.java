package ru.meizin.drawings;

import java.awt.Graphics;
public class Drawing {
    public int x = 100, y = 100, width = 140, height = 80;

    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
