package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Manish's Library");
        Book book1 = new Book("AstroPhysics", "Manish Singh Rawal", "Twentytwenty");
        Book book2 = new Book("Delight", "Rahul Dev", "Forty");
        Book book3 = new Book("Bonanza", "Sikander DePaul", "Sixty");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBook();

        Book s = library.findBook("Delight");
        System.out.println("The details of book found is: " + s);

        library.removeBook(book2);
        System.out.println("The updateed book list is");
        library.displayBook();



    }
}
