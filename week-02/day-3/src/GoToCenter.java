import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void drawLine (int xPoint, int yPoint, Graphics graphics)
    {
        int randomR = (int) (Math.random()*256);
        int randomG = (int) (Math.random()*256);
        int randomB = (int) (Math.random()*256);
        graphics.setColor(new Color(randomR,randomB,randomG));
       graphics.drawLine(xPoint,yPoint,HEIGHT/2,WIDTH/2);



    }

    public static void mainDraw(Graphics graphics){
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        for (int i = 0; i < 3; i++) {
            int randomNumA = (int) (Math.random()*801);
            int randomNumB = (int) (Math.random()*801);
            drawLine(randomNumA,randomNumB,graphics);

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