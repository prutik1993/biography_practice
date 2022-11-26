public class Book {
    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     Create a custom constructor that will take 3 args and defines the Book object
     Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
    public Book(String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    public static Book createBook(){

            String bookName = ScannerHelper.getString(Questions.favoriteBookName);
            String bookGenre = ScannerHelper.getString(Questions.favoriteBookGenre);
            int bookPage = ScannerHelper.getInt(Questions.favoriteBookPages);

        return new Book(bookName,bookGenre,bookPage);
    }

    //Define instance variables here
    //YOUR CODE HERE
     String name;
     String genre;
     int totalPage;
    

    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createBook());
    }
}
