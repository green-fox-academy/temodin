public class TodoPrint {
    public static void main(String[] args) {
        String toDoText = " - Buy milk\n";
        toDoText = "My todo:\n" + toDoText + " - Download games\n" + " - Diablo".indent(4);

        System.out.println(toDoText);
    }
}