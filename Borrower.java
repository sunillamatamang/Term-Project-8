/** 
 * This abstract Borrower class is part of the Library Mangement System, which allows users to 
 * manage books, borrowers, and transactions (borrowing/ returning books). This class creates a 
 * Borrower object with the attributes ID, name, and contact details. This class also provides 
 * methods to ... print out borrower object information.
 */

public class Borrower {
  
  // Attributes

  private int id;
  private String name;
  private String contact;



  // Constructor

  /**
   * The book constructor creates a new Book object with the given book information.
   * @param id The numeric code assigned to a specific borrower.
   * @param name The name of the borrower.
   * @param contact The borrower's contact details.
   */

  public Borrower(int id, String name, String contact) {
  this.id = id;
  this.name = name;
  this.contact = contact;
  }



  /**
   * The ... method prints out the Borrower object attributes...
   * @return String of Book object attributes.
   */
  ..
  public int getId() {
      return id;
  }

  public String getName() {
      return name;
  }

  public String getContact() {
      return contact;
    }


}
