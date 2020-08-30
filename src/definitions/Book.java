/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnBookNumber;

    public Book() {
        bookName = "Wings Of Fire";
        authorName = "A.P.J. Abdul Kalam";
        isbnBookNumber = "9193008986742";
    }

    public Book(String bookName) {
        this.bookName = bookName;
        authorName = "A.P.J. Abdul Kalam";
        isbnBookNumber = "9193008986742";
    }

    public Book(String bookName, String authorName, String isbnBookNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnBookNumber = isbnBookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnBookNumber() {
        return isbnBookNumber;
    }

    public void setIsbnBookNumber(
            String isbnBookNumber) {
        this.isbnBookNumber = isbnBookNumber;
    }

    public String toString() {
        return String.format("Book Name is %s, Author's Name is %s, ISBN Number Of This Book Is %l", bookName, authorName, isbnBookNumber);
    }

    public int hashCode() {

        return Objects.hash(getBookName(), getAuthorName(), getIsbnBookNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(isbnBookNumber, book.isbnBookNumber);
    }
}