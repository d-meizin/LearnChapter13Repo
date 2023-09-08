package ru.meizin.drawings;
import java.awt.Graphics;
public class Drawing {
    protected int x1 = 100, y1 = 100, width1 = 140, height1 = 80;
    protected int x2 = 200, y2 = 200, width2 = 140, height2 = 80;
    protected int x3 = 400, y3 = 140, width3 = 80, height3 = 140;

    public void paintMyCircle(Graphics graph) {
        graph.drawOval(x1, y1, width1, height1);
        graph.drawOval(x2, y2, width2, height2);
        graph.drawOval(x3, y3, width3, height3);
        System.out.println("Отработал метод paintMyCircle()");
    }
}
