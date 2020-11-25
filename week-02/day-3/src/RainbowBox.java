import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {



    public static void drawRectangle (int sizeA, int sizeB, Graphics graphics)
    {


        int posX = WIDTH/2 - sizeA/2;
        int posY = HEIGHT/2 - sizeB/2;
        graphics.drawRect(posX,posY,sizeA,sizeB);

    }

    public static void mainDraw(Graphics graphics){
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        int[][] rainbowColours = {
                {255,0,0},
                {255,165,0},
                {255,255,0},
                {0,255,0},
                {0,0,255},
                {75,0,130},
                {128,0,128},
        };
        int randomA;
        //int randomB;
        for (int i = 0; i < 7; i++) {
            graphics.setColor(new Color(rainbowColours[i][0],rainbowColours[i][1],rainbowColours[i][2]));
            randomA = (int) (Math.random()*801);
            //randomB = (int) (Math.random()*801);
            drawRectangle(randomA,randomA,graphics);
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