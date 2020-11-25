import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFuction {
    public static void drawRectangle (int sizeA, int sizeB, Graphics graphics)
    {
        int posX = WIDTH/2 - sizeA/2;
        int posY = HEIGHT/2 - sizeB/2;

        graphics.drawRect(posX,posY,sizeA,sizeB);

    }

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int randomA;
        int randomB;
        for (int i = 0; i < 400; i++) {
            randomA = (int) (Math.random()*801);
            randomB = (int) (Math.random()*801);
            drawRectangle(randomA,randomB,graphics);
        }


    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}