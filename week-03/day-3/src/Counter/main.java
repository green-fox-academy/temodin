package Counter;

public class main {
    public static void main(String[] args) {

        Counter myCounter1 = new Counter();
        Counter myCounter2 = new Counter(20);

        System.out.println(myCounter1.value);
        System.out.println(myCounter2.value);

        myCounter2.add(20);

        System.out.println(myCounter2.value);

        myCounter1.add();

        System.out.println(myCounter1.value);

        System.out.println(myCounter1.get());

        myCounter2.reset();

        System.out.println(myCounter2.value);
    }
}
