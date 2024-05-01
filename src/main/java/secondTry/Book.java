package secondTry;

import javax.xml.stream.StreamFilter;

public class Book {
    private String title;
    private String author;
    private int isbn;        //isbn is 'int'!

    //Constructor
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Getter----------
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    //Setter-----------
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // toString use 'return' instead of 'System.out.println()'!!!!!
    // -----my error 'toString()'------
/*    public void toString(){
        System.out.println();
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
