package library.app;

import library.db.DB;
import library.model.Book;
import library.model.Patron;
import library.model.Transaction;
import library.service.Library;

import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        // BOOKS
        DB.bookList.add(new Book("Atomic Habits", "Jon Doe", 2001));
        DB.bookList.add(new Book("O'tkan kunlar", "O'tkir Xoshimov", 2005));
        DB.bookList.add(new Book("Deep Work", "John Stilinski", 2003));

        // PATRONS
        DB.patronList.add(new Patron("Sobir Botirov", "Sergeli, Choshtepa", "sobir12@gmail.com"));
        DB.patronList.add(new Patron("Botir Rahimov", "Chilonzor, 5-hudud", "botir2323212@gmail.com"));
        DB.patronList.add(new Patron("Jalil Otabekov", "Olamzor, Massiv-7", "jalildeveloper11@gmail.com"));

        // TRANSACTIONS
        DB.transactionList.add(new Transaction(DB.bookList.get(1), DB.patronList.get(1), "12 June 2023"));
        DB.transactionList.add(new Transaction(DB.bookList.get(2), DB.patronList.get(2), "25 June 2023"));

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Library Management App!");

        while (true) {
            System.out.println("""
                    MENU:
                    1.  SHOW_BOOK_LIST
                    2.  SHOW_PATRON_LIST
                    3.  SHOW_TRANSACTION_LIST
                    4.  ADD_BOOK
                    5.  REMOVE_BOOK
                    6.  REGISTER_PATRON
                    7.  UPDATE_PATRON
                    8.  REMOVE_PATRON
                    9.  BORROW_BOOK
                    10. RETURN_BOOK
                    11. PROVIDE_REPORT
                    12. EXIT""");

            System.out.println("Choose order of option from the MENU to start managing: ");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> library.showAllBooks();
                case 2 -> library.showAllPatrons();
                case 3 -> library.showTransactions();
                case 4 -> {
                    System.out.println("Enter the title of the book: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the name of the author: ");
                    String author = sc.nextLine();
                    System.out.println("Enter the publication year: ");
                    int publicationYear = sc.nextInt();
                    library.addBook(title, author, publicationYear);
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {
                }
                case 10 -> {
                }
                case 11 -> {
                }
                case 12 -> System.exit(0);
            }
        }

    }
}