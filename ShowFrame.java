//import ru.meizin.drawings.Drawing;
import ru.meizin.frames.ArtFrame;

class ShowFrame {
    public static void main(String args[]) {
        new ArtFrame(new DrawingWide());

        //ArtFrame artFrame = new ArtFrame(new Drawing());
        //artFrame.setSize(800, 400);
        //artFrame.setVisible(true);
        System.out.println("Отработал main()");
    }
}
