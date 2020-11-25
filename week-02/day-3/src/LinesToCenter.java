import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesToCenter {
    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.WHITE);
    int posX = 0;
    int posY = 0;
    int centerX = WIDTH/2;
    int centerY = HEIGHT/2;
    int step = 20;
    int lineCount = HEIGHT/step;

    //draw lines from top and bottom
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < lineCount +1; j++) {
            graphics.drawLine(posX,posY,centerX,centerY);
            posX += step;
            }
            posY = HEIGHT;
            posX = 0;
        }
        //get back to origo
        posX = 0;
        posY = 0;

    //draw lines from left and right
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < lineCount +1; j++) {
                graphics.drawLine(posX,posY,centerX,centerY);
                posY += step;
            }
            posX = WIDTH;
            posY = 0;
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