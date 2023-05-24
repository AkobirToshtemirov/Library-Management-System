package library.model;

public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final boolean isAvailable; // status

    public Book(String title, String author, int publicationYear, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
