/** 
 * This abstract Book class is part of the Library Mangement System, which allows users to manage 
 * books, borrowers, and transactions (borrowing/ returning books). This class creates a Book 
 * object with the attributes ID, title, author, genre, and availability. This class also provides 
 * methods to borrow and return books, as well as print book object information.
 */

public class Book {

  // Attributes

  private String id; // The unique ID of the book.
  private String title; // The title of the book.
  private String author; // The author of the book.
  private String genre; // The genre of the book.
  private boolean isAvailable; // The availability of the book.

  // Constructor

  /**
   * The book constructor creates a new Book object with the given book information.
   * @param id The numeric code assigned to a specific book.
   * @param title The title of the book.
   * @param author The author of the book.
   * @param genre The genre of the book.
   */

  public Book(String id, String title, String author, String genre) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.isAvailable = true; // Default to available
  }

  // Getter methods to access private fields
  public int getId() { return id; }
  public String getTitle() { return title; }
  public String getAuthor() { return author; }
  public String getGenre() { return genre; }
  public boolean isAvailable() { return availability; }

  // Method to set book availability to borrowed.
  public void borrowBook() { this.isAvailable = false; }
  // Method to set book availability to available.
  public void returnBook() { this.isAvailable = true; }

  // Setter methods used in edit functionality
  public void setTitle(String title) { this.title = title; }
  public void setAuthor(String author) { this.author = author; }
  public void setGenre(String genre) { this.genre = genre; }
  
  /**
   * The toString method prints out the Book object attributes id, title, author, and isAvailable.
   * @return String of Book object attributes.
   */
  
  public String toString() {
    return id + " - " + title + " by " + author + " [" + (isAvailable ? "Available" : "Borrowed") +
           "]";
  }
}
