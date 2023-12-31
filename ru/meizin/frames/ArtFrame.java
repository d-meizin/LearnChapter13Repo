package ru.meizin.frames;

import java.awt.Graphics;
import javax.swing.JFrame;
import ru.meizin.drawings.Drawing;
public class ArtFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    Drawing drawingArt;

    public ArtFrame(Drawing drw) {
        this.drawingArt = drw;
        setTitle("Произведение абстрактного искусства");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 400);
        setVisible(true);
        System.out.println("Отработал конструктор ArtFrame()");
    }

    public void paint(Graphics grf) {
        drawingArt.paintMyCircle(grf);
        System.out.println("Отработал метод обратного вызова paint()");
    }
}