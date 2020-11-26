import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTicTac2 {
    public static void mainDraw(Graphics graphics){

        //structure on the left
        graphics.setColor(Color.GREEN);
        int positionAX = 0;
        int positionAY = 100;
        int positionBX = 50;
        int positionBY = 800;
        for (int i = 0; i < 14; i++) {
       graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
       positionAY += 50;
       positionBX += 50;
        }

        //structure on the right
        graphics.setColor(Color.MAGENTA);
        positionAX = 100;
        positionAY = 0;
        positionBX = 800;
        positionBY = 50;
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX += 50;
            positionBY += 50;
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
