import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics){
    int randomX;
    int randomY;
    int starSize = 1;
    int randomGrey;

        for (int i = 0; i < 10000; i++) {
            randomGrey = (int)(Math.random()*256);
            randomX = (int)(Math.random()*(WIDTH-4));
            randomY = (int)(Math.random()*(HEIGHT-4));
            graphics.setColor(new Color(randomGrey,randomGrey,randomGrey));
            graphics.fillRect(randomX,randomY,starSize,starSize);

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