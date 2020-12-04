import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingWithRecursion {

    public static void mainDraw(Graphics graphics, int x, int y, int radius) {
        graphics.drawOval(x,y,radius,radius);
        if (radius > 2) {
            radius -= 5;
            mainDraw(graphics,x,y,radius);
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