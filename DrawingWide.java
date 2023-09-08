import java.awt.Graphics;
import ru.meizin.drawings.Drawing;
public class DrawingWide extends Drawing {

    int width1 = 260, height1 = 30;

      public void paintMyCircle(Graphics graph) {
        graph.drawOval(x1, y1, width1, height1);
        graph.drawOval(x2, y2, width2, height2);
        graph.drawOval(x3, y3, width3, height3);
          System.out.println("Отработал метод paintMyCircleWide()");
    }

}
