package secondTry;

public class Main {
    public static void main(String[] args){

        //----------Objects of Class Car------------------
        Car car1 = new Car("brand1", "model1", "red", 2024);
        car1.startCar();

        Car car2 = new Car("brand2", "model2", "green", 2022, 35);
        car2.accelerateCar(60);

        //----------Objects of Class Person------------------
        Person person1 = new Person("Mary", 3, "f" );
        Person person2 = new Person("Bob", 7, "m" );
        person1.introduce();
        person2.introduce();

        //--------Objects of Class Library (store a Array of Objects of Class 'Book')-----
        Book book1 = new Book("title1", "author1", 1111);
        Book book2 = new Book("title2", "author2", 2222);
        Book book3 = new Book("title3", "author3", 3333);
        Book[] books = {book1, book2, book3};    //error!!! : Library books = {book1, book2, book3};
        Library library1 = new Library(books);
        System.out.println(library1);

        //error : Library library1 = new Library({new Book("title1", "author1", 1111), new Book("title2", "author2", 2222), new Book("title3", "author3", 3333)});



    }
}
