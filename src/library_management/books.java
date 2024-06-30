package library_management;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class books {

    private int bookID;
        private String title;
        private int authorID;
        private String ISBN;
        private int publisherID;
        private int yearPublished;
        private String genre;
        private int copiesAvailable;
        private String shelfLocation;
        private int categoryID;

    public books(int bookID, String title, int authorID, String ISBN, int publisherID, int yearPublished, String genre, int copiesAvailable, String shelfLocation, int categoryID) {
        this.bookID = bookID;
        this.title = title;
        this.authorID = authorID;
        this.ISBN = ISBN;
        this.publisherID = publisherID;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.copiesAvailable = copiesAvailable;
        this.shelfLocation = shelfLocation;
        this.categoryID = categoryID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }


}
