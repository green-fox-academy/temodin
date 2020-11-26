import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        int increment = HEIGHT/2/16;
        int tileHeight = HEIGHT/2;
        int tileWidth = WIDTH/2;

        //structure on the upper left
        int positionAX = 0 + increment;
        int positionAY = tileHeight;
        int positionBX = tileWidth;
        int positionBY = tileHeight - increment;
        for (int i = 0; i < 16; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX += increment;
            positionBY -= increment;
        }

        //structure on the upper right
        positionAX = tileWidth*2-increment;
        positionAY = tileHeight;
        positionBX = tileWidth;
        positionBY = tileHeight - increment;
        for (int i = 0; i < 16; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX -= increment;
            positionBY -= increment;
        }

        //structure on the bottom left
        positionAX = 0 + increment;
        positionAY = tileHeight;
        positionBX = tileWidth;
        positionBY = tileHeight + increment;
        for (int i = 0; i < 16; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX += increment;
            positionBY += increment;
        }

        //structure on the bottom right
        positionAX = tileWidth*2 - increment;
        positionAY = tileHeight;
        positionBX = tileWidth;
        positionBY = tileHeight + increment;
        for (int i = 0; i < 16; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX -= increment;
            positionBY += increment;
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
            this.setBackground(Color.WHITE);
        }
    }
}
