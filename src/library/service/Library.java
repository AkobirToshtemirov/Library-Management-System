package library.service;

import library.db.DB;
import library.helpers.Counter;
import library.model.Book;
import library.model.Patron;
import library.model.Transaction;

public class Library {
    Counter counter = new Counter();

    public void addBook(String title, String author, int publicationYear) {
        DB.bookList.add(new Book(title, author, publicationYear));
    }

    public void removeBook(Book book) {
        DB.bookList.remove(book);
    }

    public void registerPatron(String name, String address, String email) {
        DB.patronList.add(new Patron(name, address, email));
    }

    public void updatePatron(String patronID, String name, String address, String email) {
        if (getPatronByID(patronID) != -1) {
            DB.patronList.get(getPatronByID(patronID)).setName(name);
            DB.patronList.get(getPatronByID(patronID)).setAddress(address);
            DB.patronList.get(getPatronByID(patronID)).setEmail(email);
        } else {
            System.out.println("No user found!");
        }
        //Update patron information such as address or email.
    }

    public void removePatron(Patron patron) {
        DB.patronList.remove(patron);
    }

    public void borrowBook() {
        //Allow a patron to borrow a book if it is available.
    }

    public void returnBook() {
        //Mark a book as returned by a patron.
    }

    public void provideReport() {
        //provide reports such as a list of overdue books
        //Generate a report of all overdue books.
    }

    public void showAllBooks() {
        for (Book book : DB.bookList) {
            counter.increment();
            System.out.println(counter.getCount() + " " + book.getTitle());
        }
        counter.reset();
    }

    public void showAllPatrons() {
        for (Patron patron : DB.patronList) {
            counter.increment();
            System.out.println(counter.getCount() + " " + patron.getName());
        }
        counter.reset();
    }

    public void showTransactions() {
        for (Transaction transaction : DB.transactionList) {
            counter.increment();
            System.out.println(counter.getCount() + " " +
                    " Patron: " + transaction.getBorrowingPatron().getName()+
                    ", Book: " + transaction.getBorrowedBook().getTitle() +
                    ", Returning Dat: " + transaction.getReturningDate());
        }
        counter.reset();
    }

    public int getPatronByID(String patronID) {
        for (int i = 0; i < DB.patronList.size(); i++)
            if (DB.patronList.get(i).getUiqueID().equals(patronID)) return i;
        return -1;
    }
}

// Rules !!!
// 1)
/*
Ensure that the system enforces appropriate business rules,
such as not allowing a patron to borrow more than a certain
number of books at a time or disallowing a book to be borrowed
if it is already checked out.
*/
//2)
/*
Use generics to make your classes and methods more flexible and reusable.
For example, you can use generics to create a collection of books or patrons
that can store objects of any specific type.
 */
//3)
/*
Implement proper error handling and validation for user inputs.
*/
//4)
/*
Write a test program that demonstrates the functionality of your Library Management System.
Create sample books, patrons, and transactions and perform various operations to validate
the correctness of your implementation.
*/