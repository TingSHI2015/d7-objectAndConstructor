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


    //Bonus: the key for add & remove is: array length can't change!!!!
    public boolean containsBook(Book book){
        for (int i=0; i < books.length; i++){
            if (books[i].equals(book)) {            //--don't forget the green() here!!!
                return true;
            }
            //return false;             //--wrong place for return here!
        }
        return false;                   //--right place for return here!
    }

    public boolean containsBook2(Book book) {
        for (Book b:books) {
            if (b != null && b.equals(book)) {   //Ting------use 'null'! not '0'!
                return true;  // If a book with the same details is found, return true
            }
        }
        return false;  // If the loop completes without finding a matching book, return false
    }



}
