package Sharpie;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Sharpie pen = new Sharpie("purple",1.1F);
        Sharpie marker = new Sharpie("red",1.3F);
        Sharpie pencil = new Sharpie("black",0.5F);

        SharpieSet mySet = new SharpieSet();
        mySet.sharpies = Arrays.asList(pen,marker,pencil);

        for (Sharpie sharpie : mySet.sharpies
             ) {
            System.out.println(sharpie.color +" "+ sharpie.width+" " + sharpie.inkAmount);

        }

        pen.use();
        pen.use();
        pen.use();
        pen.use();
        pen.use();
        pen.use();

        System.out.println(pen.inkAmount);

        System.out.println("The number of usable sharpies is: " +   mySet.countUsable());
        mySet.removeTrash();

        for (Sharpie sharpie : mySet.sharpies
        ) {
            System.out.println(sharpie.color +" "+ sharpie.width+" " + sharpie.inkAmount);

        }


    }
}
