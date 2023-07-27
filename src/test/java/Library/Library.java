package Library;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    public String name;
    public ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    public void removeBook(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            if (currentBook.equals(book)) {
                iterator.remove();
                break;
            }
        }
    }

    public Book findBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            if (currentBook.getTitle().equalsIgnoreCase(title)) {
                return currentBook;
            }
        }
        return null;
    }

    public void displayBook(){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            System.out.println("Title: " + currentBook.getTitle());
            System.out.println("Author: " + currentBook.getAuthor());
            System.out.println("ISBN: " + currentBook.getISBN());
            System.out.println();
        }

    }

}
