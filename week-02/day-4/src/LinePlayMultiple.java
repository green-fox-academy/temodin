import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayMultiple {

    public static void drawTile (int tileUpperLeftX,int tileUpperLeftY, int tileHeight, int tileWidth, int increment, Graphics graphics) {
        //draw the left side of the tile
        graphics.setColor(Color.GREEN);
        //go to the starting position
        int positionAX = tileUpperLeftX;
        int positionAY = tileUpperLeftY + tileHeight/8;
        int positionBX = tileUpperLeftX + increment;
        int positionBY = tileUpperLeftY + tileHeight;
        //draw 14 lines per tile
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAY += increment;
            positionBX += increment;
        }
        //draw the right side of the tile
        graphics.setColor(Color.MAGENTA);
        //go to the starting position
        positionAX = tileUpperLeftX + tileHeight/8;
        positionAY = tileUpperLeftY;
        positionBX = tileUpperLeftX + tileWidth;
        positionBY = tileUpperLeftY + increment;
        //draw 14 lines per tile
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(positionAX,positionAY,positionBX,positionBY);
            positionAX += increment;
            positionBY += increment;
        }

    }

    public static void mainDraw(Graphics graphics){

        //setting basic variables
        int splitInto = 512; //user input, how many tiles are to be drawn
        int rectMulti = (int)Math.sqrt(splitInto); // how many tiles on each side
        int tileHeight = HEIGHT/(rectMulti); //height of a single tile
        int tileWidth = WIDTH/(rectMulti); //width of a single tile
        int increment = tileHeight/16; //steps to change the line starting points within the tile
        int tileUpperLeftX = 0;
        int tileUpperLeftY = 0;

        //
        for (int i = 0; i < rectMulti; i++) {
            for (int j = 0; j < rectMulti; j++) {
            //go to the starting position of the tile
          tileUpperLeftX = j*tileWidth;
          tileUpperLeftY = i*tileHeight;
          //run method to draw tile
          drawTile(tileUpperLeftX,tileUpperLeftY,tileHeight,tileWidth,increment,graphics);
            }
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
