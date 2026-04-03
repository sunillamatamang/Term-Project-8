/** 
 * This abstract LibraryService class is part of the Library Mangement System, which allows users 
 * to manage books, borrowers, and transactions (borrowing/ returning books). This class uses 
 * ArrayList to manage book object data. This class implements the addBook(), editBook(), 
 * borrowerBook(), returnBook(), and searchBook() methods.
 */
import java.util.ArrayList;


public class LibraryService {
  
  // Attributes
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<Borrower> borrowers = new ArrayList<>();


  // Constructor
  public LibraryService(ArrayList<Book> books, ArrayList<Borrower> borrowers) {
      this.books = books;
      this.borrowers = borrowers;
  }

  /**
   * 
   */



  // Method to add a book object to the array list.
  public void addBook(Book book) {
      // Check for duplicate ID
      for (Book b : books) {
          if (b.getId() == book.getId()) {
              System.out.println("Book already exists with this ID.");
              return;
          }
      }
        // If no duplicate found, book added
        books.add(book);
        System.out.println("Book added successfully.");
    }

  // Method to edit a book object in the array list.
  public void editBook(int id, String author, String title, String genre){
      for (Book book:books){
          if ( book.getId() == id){
              book.setAuthor(author);
              book.setTitle(title);
              book.setGenre(genre);
              System.out.println("Name Successfully Changed");
              return;
          }
      }
      System.out.println("Book ID not found. Try another Book ID");
    }

  // Method to Borrow book from the array list
  public void borrowBook(int id, int borrowerId) {

      for (Book book : books) {
          if (book.getId() == id) {
              if (!book.isAvailable()) {
                  System.out.println("Book is already borrowed.");
                  return;
              }
              book.borrowBook();
              System.out.println("Book borrowed successfully.");
              return;
            }
        }
        System.out.println("Book not found.");
    }

  
  // Method to return the book to the array list
  public void returnBook(int id, int borrowerId) {
      Book foundBook = null;

      // Find the book
      for (Book book : books) {
          if (book.getId() == id) {
              foundBook = book;
              break;
          }
      }

      if (foundBook == null) {
          System.out.println("Book not found.");
          return;
      }
      // Check if already available
      if (foundBook.isAvailable()) {
          System.out.println("Book is already available.");
          return;
      }
        // Return the book
      foundBook.returnBook();
      System.out.println("Book returned successfully.");
    }

  // Method to set book object in the array list to unavailable.

  // Method to set book object in the array list to available.

  // Method to find a book object in the array list.
  public void searchBookByName(String name){
      boolean found = false;
      for (Book book: books){
          if (book.getTitle().toLowerCase().contains(name.toLowerCase())){
              System.out.println(book);
              found = true;
          }
      }

      if(!found){
          System.out.println("Books not found");
      }
  }
    

}
