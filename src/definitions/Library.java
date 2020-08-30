/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[25];
        for (int indexNumber = 0; indexNumber < availableBooks.length; indexNumber++) {
            availableBooks[indexNumber] = new Book("Book " + (indexNumber + 1));
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public String getAvailableBooks() {
        return Arrays.toString(availableBooks);
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public String toString() {
        return String.format("ALL AVAILABLE BOOKS ARE : %s", Arrays.toString(availableBooks));
    }

    public int hashCode() {
        return Objects.hash(getAvailableBooks());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);
    }
}