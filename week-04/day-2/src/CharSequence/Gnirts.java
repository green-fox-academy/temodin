package CharSequence;

public class Gnirts implements CharSequence{
    private String text;

    public Gnirts (String text) {
        this.text = text;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.text.charAt((this.text.length()-1)-index);

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
