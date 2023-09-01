package ru.meizin.drawings;

import java.awt.Graphics;
public class Drawing {
    public int x = 100, y = 100, width = 140, height = 80;

    public void paintMyCircle(Graphics graph1) {
        graph1.drawOval(x, y, width, height);
    }
}
