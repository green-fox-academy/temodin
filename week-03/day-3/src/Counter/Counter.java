package Counter;
public class Counter {
    int value = 0;
    int initialValue = 0;

    public Counter() {}

    public Counter(int value) {
        this.value = value;
        this.initialValue = value;
    }

    public void add(int numberToAdd) {
        this.value += numberToAdd;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return this.value;
    }

    public void reset () {
        this.value = this.initialValue;
    }




}
