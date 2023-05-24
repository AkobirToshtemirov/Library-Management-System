package library.service;

import library.model.Book;
import library.model.Patron;

import java.util.List;

public class Library {
    public void addBook(List<Book> books) {
        //Add a new book to the library by providing its details
    }

    public void removeBook(List<Book> books) {
        //Remove a book from the library.
    }

    public void registerPatron(List<Patron> patrons) {
        //Register a new patron by providing their details.
    }

    public void updatePatron() {
        //Update patron information such as address or email.
    }

    public void removePatron(List<Patron> patrons) {
        // remove Patron
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