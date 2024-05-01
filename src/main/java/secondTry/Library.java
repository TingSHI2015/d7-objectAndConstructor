package secondTry;

import java.util.Arrays;

public class Library {
    //books is an array of 'Books' objects---

//-----private Book[] books = new Book[3];  //don't forget the length of Array, if using 'new'
    private Book[] books;  //if no new, can omit the length of Array at the beginning!


    ///variable 'books' is private, muss use getter & setter method again!
    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
