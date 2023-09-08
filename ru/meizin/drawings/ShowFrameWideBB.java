package ru.meizin.drawings;
import ru.meizin.frames.ArtFrame;
class ShowFrameWideBB {
    public static void main(String args[]) {

        Drawing drawingWideBB = new Drawing();
        drawingWideBB.y3 = 90;
        drawingWideBB.width3 = 40;
        drawingWideBB.height3 = 180;

        new ArtFrame(drawingWideBB);
    }
}
