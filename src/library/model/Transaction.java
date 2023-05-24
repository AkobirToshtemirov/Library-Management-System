package library.model;

import java.util.Date;

public class Transaction {
    private final Book borrowedBook;
    private final Patron borrowingPatron;
    private final Date borrowingDate;
    private final String returningDate;

    public Transaction(Book borrowedBook, Patron borrowingPatron, String returningDate) {
        this.borrowedBook = borrowedBook;
        this.borrowingPatron = borrowingPatron;
        this.borrowingDate = new Date();
        this.returningDate = returningDate;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public Patron getBorrowingPatron() {
        return borrowingPatron;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public String getReturningDate() {
        return returningDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "borrowedBook=" + borrowedBook +
                ", borrowingPatron=" + borrowingPatron +
                ", borrowingDate=" + borrowingDate +
                ", returningDate='" + returningDate + '\'' +
                '}';
    }
}
