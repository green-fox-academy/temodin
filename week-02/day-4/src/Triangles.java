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

        //declaration and definition of starting point and size
        int side = 30;
        int topX = WIDTH/2;
        int topY = 100;
        int height = (int) (0.5*Math.sqrt(3)*side);

        //loop to draw the triangles
        for (int i = 1; i < 20; i++) {
            for (int j = 0; j < i; j++) {
                drawETriangle(side,topX,topY,height,graphics);
                if(j != (i-1)) {topX += side;}; //if last triangle in the row, dont step to the right anymore
            }
            topY += height; //go down at the end of row by triangle height
            topX = (WIDTH/2) - i * side/2; //go left at the end of the row. start from the middle and go i * side/2
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
