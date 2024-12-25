package AdvancedAuthorAndBook;

import java.util.Arrays;

//2.Write a test driver (called TestBook) to test the Book class.
public class TestBookMain {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[3];
        authors[0] = new Author("venkat", "venkat@gmail.com", 'm');
        authors[1] = new Author("david", "david@gmail.com", 'm');
        authors[2] = new Author("deepak", "deepak@gmail.com", 'm');

        // Declare and allocate a Book instance
        Book aBook = new Book("Java", authors, 99.99, 150);
        System.out.println(aBook);  // toString()
        aBook.setPrice(89.99);
        aBook.setQty(99);

        //Testing the Setters
        System.out.println("Book name is: "+aBook.getName());
        System.out.println("Authors Details are: "+ Arrays.toString(aBook.getAuthors()));
        System.out.println("The Price of Book is: "+aBook.getPrice());
        System.out.println("The quantity of books: "+aBook.getQty());
        System.out.println();
        System.out.println("The Author names are: "+aBook.getAuthorNames());
    }
}
