import java.util.ArrayList;

public class Author {
    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }
    /*
            Define instance variables here
            NOTE: Books must be defined as a List of Objects of Book class not String
        */
    //YOUR CODE HERE
     String firstName;
     String lastName;
     String country;
     boolean isAlive;
     int age;
     ArrayList<Book> books = new ArrayList<>();
    public static Author createAuthor(){
        String firstName = ScannerHelper.getString(Questions.authorFirstName);
        String lastName = ScannerHelper.getString(Questions.authorLastName);
        String country = ScannerHelper.getString(Questions.authorFrom);
        String alive = ScannerHelper.getString(Questions.authorAlive);
        boolean isAlive = false;
        int age = 0;

        if(alive.equalsIgnoreCase("y")){
            isAlive = true;
             age = ScannerHelper.getInt(Questions.authorAge);
        }
        if(alive.equalsIgnoreCase("n")){
            isAlive = false;
        }
        ArrayList<Book> books = new ArrayList<>();
        do{
            String askBook = ScannerHelper.getString(
                    books.isEmpty() ? Questions.enterFavoriteBook : Questions.enterAnotherFavoriteBook);
            if(askBook.equalsIgnoreCase("n"))break;
            books.add(Book.createBook());
        }while(true);

       return new Author(firstName,lastName,country,isAlive,age,books);
    }


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE
    @Override
    public String toString() {
        return "Author's information = Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                (age != 0 ? ", age=" + age : "") +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createAuthor());
    }
}
