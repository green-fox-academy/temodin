import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

   // public static void drawStep ()

    public static void mainDraw(Graphics graphics){

        int stepSize = 50;
        int posA = 50;
        int posB = 50;
        for (int i = 0; i < 7; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(posA,posB,stepSize,stepSize);
            graphics.setColor(new Color(128,0,128));
            graphics.fillRect(posA,posB,stepSize,stepSize);
            posA += stepSize;
            posB += stepSize;
            stepSize *= 1.2;
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