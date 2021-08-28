package demo;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.process();
    }

    private void process() {
        // TODO

    }

    public List<Book> listOfBooks() {
        return books;
    }

    List<Book> books;

    public Basket addToBasket(Book book, int quantity) {
        return new Basket();
    }
}