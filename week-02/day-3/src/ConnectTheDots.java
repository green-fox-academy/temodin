
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void ConnectTheDots (int[][] coordinates, Graphics graphics)
    {
        graphics.setColor(new Color(0,175,0));
        //convert the input array of coordinates into a list of x and y coordinates, that can feed a drawpolygon function
        int[] coordinatesX = new int[coordinates.length];
        int[] coordinatesY = new int[coordinates.length];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                if (j == 0) {coordinatesX[i] = coordinates[i][j];}
                else {coordinatesY[i] = coordinates[i][j];}
            }
        }
        //System.out.println(Arrays.toString(coordinatesX));
        //System.out.println(Arrays.toString(coordinatesY));

        graphics.fillPolygon(coordinatesX,coordinatesY, coordinates.length);
    }

    public static void mainDraw(Graphics graphics){
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

       ConnectTheDots(new int[][] {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}},graphics);

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
