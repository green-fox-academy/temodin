package Sharpie;

public class main {
    public static void main(String[] args) {

        Sharpie pen = new Sharpie("purple",1.1F);

        pen.use();
        pen.use();
        pen.use();
        pen.use();
        pen.use();
        pen.use();

        System.out.println(pen.inkAmount);

    }
}
