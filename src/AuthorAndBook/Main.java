package AuthorAndBook;

public class Main {
    public static void main(String[] args){

        //The below are for testing Author class
        Author anAuthor = new Author("Mufasa", "mufasa@gmail.com", 'm'); // Test the constructor
        System.out.println(anAuthor);  // Test toString()
        anAuthor.setEmail("simbba@gmail.com");  // Test setter
        System.out.println("Author name is: " + anAuthor.getName());     // Test getter
        System.out.println("Author email is: " + anAuthor.getEmail());   // Test getter
        System.out.println("Author gender is: " + anAuthor.getGender()); // Test getter

        //The below are for testing Book class
        Book aBook = new Book("LionKing", anAuthor, 39.99, 199);  // Test Book's Constructor
        System.out.println(aBook);  // Test Book's toString()

        // Test Getters and Setters
        aBook.setPrice(49.99);
        aBook.setQty(129);
        System.out.println("Book name is: " + aBook.getName());
        System.out.println("Book price is: " + aBook.getPrice());
        System.out.println("Book qty is: " + aBook.getQty());
        System.out.println("Author's name is: " + aBook.getAuthor().getName());
        System.out.println("Author's email is: " + aBook.getAuthor().getEmail());
        System.out.println();

        // The below are the given tasks to try
        //1.Printing the name and email of the author from a Book instance.
        Book newBook=new Book("Peaceful Mind",new Author("kary","kary@gmail.com",'f'),99.99,78);
        System.out.println("Name of the author from book instance is: "+newBook.getAuthor().getName());
        System.out.println("Email of the author from book instance is: "+newBook.getAuthor().getEmail());
        System.out.println();

        //2.Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book
        // class to return the name, email and gender of the author of the book
        System.out.println("Getting author name from getter of Book Instance: "+newBook.getAuthorName());
        System.out.println("Getting author mail from getter of Book Instance: "+newBook.getAuthorEmail());
        System.out.println("Getting author gender from getter of Book Instance: "+newBook.getAuthorGender());
    }
}
