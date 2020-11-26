import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics){

        int x = 200; //starting pos x
        int y = 200; //starting pos y
        int s = 200; //side
        int h = (int) (0.5*Math.sqrt(3)*s); //height

        int posAX = x-s;
        int posAY = y;
        int posBX = x-s/2;
        int posBY = x-h;
        int posCX = x + s/2;
        int posCY = x-h;
        int posDX = x + s;
        int posDY = y;
        int posEX = x + s/2;
        int posEY = y + h;
        int posFX = x- s/2;
        int posFY = y + h;

        int [] xCoordiates = {posAX,posBX,posCX,posDX,posEX,posFX};
        int [] yCoordiates = {posAY,posBY,posCY,posDY,posEY,posFY};

        graphics.drawPolygon(xCoordiates,yCoordiates,xCoordiates.length);



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
