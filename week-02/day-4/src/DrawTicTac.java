import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTicTac {
    public static void mainDraw(Graphics graphics) {
        int squareSize = 100;
        int rowCount = WIDTH / squareSize;
        int colCount = HEIGHT / squareSize;
        int posX = 0;
        int posY = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                //create a diff color pattern in each row
                if (i % 2 == 0 && j % 2 == 0) {
                    graphics.setColor(Color.GRAY);
                } else if (i % 2 == 0 && j % 2 == 1) {
                    graphics.setColor(Color.WHITE);
                } else if (i % 2 == 1 && j % 2 == 0) {
                    graphics.setColor(Color.WHITE);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    graphics.setColor(Color.GRAY);
                }
                //draw square
                graphics.fillRect(posX, posY, squareSize, squareSize);
                //go right
                posX += squareSize;
            }
            //go down and to the beginning of the row
            posY += squareSize;
            posX = 0;
        }
        graphics.setColor(Color.DARK_GRAY);
        String a = "O";
        graphics.setFont(new Font("Arial", Font.PLAIN, 80));
        graphics.drawString(a, 20, 80);
        int[][] coordinates = {{WIDTH / 3 + 20}};
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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
