import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int randomR;
        int randomG;
        int randomB;
        int randomX;
        int randomY;
        int randomAsize;
        int randomBsize;

        for (int i = 0; i < 4000; i++) {
            //generate random colors and set it
            randomR = (int) (Math.random()*256);
            randomG = (int) (Math.random()*256);
            randomB = (int) (Math.random()*256);
            graphics.setColor(new Color(randomR,randomG,randomB));
            //generate the parameters and draw rectangle
            randomX = (int) (Math.random()*751);
            randomY = (int) (Math.random()*751);
            randomAsize = (int) (Math.random()*51);
            randomBsize = (int) (Math.random()*51);
            graphics.drawRect(randomX,randomY,randomAsize,randomBsize);

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
            this.setBackground(Color.BLACK);
        }
    }
}