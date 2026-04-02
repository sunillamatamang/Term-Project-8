# Term-Project-8

**Library Management System**
This Library Mangement System allows users to manage books, borrowers, and transactions (borrowing/returning books). 
This project applies OOP principles, file handling, collections, and CLI interactions.

Project Features:
1. Book Mangement
   - Add, edit, delete, and list books.
   - Each book has ID, title, author, genre, availability status.
2. Borrower Management
   - Register, update, or delete borrowers.
   - Store ID, name contatct details.
3. Borrow & Return Books
   - Allow borrowers to borrow available books.
   - Mark books as borrowed/returned.
   - Track due dates and impose a late return fee (future feature).
4. Search & Filter
   - Search books by title, author, or genre.
   - Filter books by availability status.
5. File Handling
   - Store book & borrower data in text files (books.txt, borrowers.txt).
6. CLI-Based
   - Console-based menu using Scanner.

-------------------------------------------------------------------------------------------------------------------

**Technology Stack**
Programming Language: Java (JDK 11+)
Concepts Covered:
  - OOP: Encapsulation, inheritance, polymorphism
  - Collections: ArrayList, HashMap
  - File Handling: Read/write operations
  - User Interface: Console

-------------------------------------------------------------------------------------------------------------------

**Project Structure**
LibraryManagementSystem
|-- src
|   |-- models
|   |   |-- Book.java
|   |   |-- Borrower.java
|   |-- services
|   |   |-- LibraryService.java
|   |   |-- FileHandler.java (or DatabaseHandler.java)
|   |-- ui/
|   |   |-- Main.java (CLI)
|-- books.txt
|-- borrowers.txt
|-- README.md (Documentation)

-------------------------------------------------------------------------------------------------------------------

**Contributors**
Batch567 - Marv Fiscus
