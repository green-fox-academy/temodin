import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class Triangles {
    public static void drawETriangle (int side, int topX, int topY, int height, Graphics graphics) {
        int[] x = {topX, topX - side / 2, topX + side / 2};
        int[] y = {topY, topY + height, topY + height};
        graphics.drawPolygon(x, y, x.length);
    }

    public static void mainDraw(Graphics graphics){

        int side = 30;
        int topX = WIDTH/2;
        int topY = 100;
        int height = (int) (0.5*Math.sqrt(3)*side);

        for (int i = 1; i < 20; i++) {
            for (int j = 0; j < i; j++) {
                drawETriangle(side,topX,topY,height,graphics);
                if(j != (i-1)) {topX += side;};
            }
            topY += height;
            topX = (WIDTH/2) - i * side/2;
        }
        /*
        int[] x = {topX, topX - side / 2, topX + side / 2};
        int[] y = {topY, topY + height, topY + height};

        graphics.drawPolygon(x, y, x.length);
*/

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
