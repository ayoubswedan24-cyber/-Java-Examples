# -Java-Examples
.ly













//wildcard///
import java.util.ArrayList;




public class Main {
    public static void printBooks(ArrayList<?> books) {
        for (Object b : books) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Java");
        books.add("C++");

        printBooks(books);
    }
}
