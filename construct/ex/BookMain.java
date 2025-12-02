package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Hello Java", "David");
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "David", 700);
        book2.displayInfo();
    }
}
