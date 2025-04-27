public class Main {
    public static void main(String[] args) {
        Book book = new Book("RPG", 1000, "red", 250, "id");

        System.out.println(book.getColor());   
        System.out.println(book.getWeight());   
    }
}