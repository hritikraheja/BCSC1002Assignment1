/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String fullName;
    private long universityRollNumber;
    private int numberOfIssuedBooks = 0;
    private Book[] namesOfIssuedBooks;

    public Student() {
        fullName = "Not Given";
        universityRollNumber = 0;
        numberOfIssuedBooks = 0;
        namesOfIssuedBooks = new Book[25];
        for (int bookNumber = 0; bookNumber < namesOfIssuedBooks.length; bookNumber++) {
            namesOfIssuedBooks[bookNumber] = new Book("Book" + (bookNumber + 1));
        }
    }

    public Student(String fullName, long universityRollNumber) {
        this.fullName = fullName;
        this.universityRollNumber = universityRollNumber;
        numberOfIssuedBooks = 0;
        namesOfIssuedBooks = new Book[25];
        for (int bookNumber = 0; bookNumber < namesOfIssuedBooks.length; bookNumber++) {
            namesOfIssuedBooks[bookNumber] = new Book("Book" + (bookNumber + 1));
        }
    }

    public Student(String fullName, long universityRollNumber, int numberOfBooksIssued, Book[] namesOfBooksIssued) {
        this.fullName = fullName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfIssuedBooks = numberOfBooksIssued;
        this.namesOfIssuedBooks = namesOfBooksIssued;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfIssuedBooks() {
        return numberOfIssuedBooks;
    }

    public void setNumberOfIssuedBooks(int numberOfIssuedBooks) {
        this.numberOfIssuedBooks = numberOfIssuedBooks;
    }

    public Book[] getNamesOfIssuedBooks() {
        return namesOfIssuedBooks.clone();
    }

    public void setNamesOfIssuedBooks(Book[] namesOfBooksIssued) {
        this.namesOfIssuedBooks = namesOfBooksIssued;
    }

    public String toString() {
        return String.format("Student's Name Is %s, Their University RollNo. Is %l, Number Of Books Issued By Them Is %d, Names Of All Books : %s", fullName, universityRollNumber, namesOfIssuedBooks, Arrays.toString(namesOfIssuedBooks));
    }

    public int hashCode() {
        return Objects.hash(getFullName(), getUniversityRollNumber(), getNumberOfIssuedBooks(), getNamesOfIssuedBooks());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfIssuedBooks == student.numberOfIssuedBooks &&
                Objects.equals(fullName, student.fullName) &&
                Arrays.equals(namesOfIssuedBooks, student.namesOfIssuedBooks);
    }

    /**
     * This method issues a book to the student.
     *
     * @param bookName The name of the book to be issued.
     */
    public void issueBook(String bookName) {
        System.out.println("The Book : " + bookName + ", Is Issued To You Successfully.\n");
        namesOfIssuedBooks[numberOfIssuedBooks] = new Book(bookName);
        numberOfIssuedBooks++;
    }

    /**
     * This method returns a book to the library issued to a student.
     *
     * @param bookName The name of the book to be returned.
     */
    public void returnBook(String bookName) {
        if (numberOfIssuedBooks == 0) {
            System.out.println("You have not issued any book, so, you cannot return now.\n");
        } else {
            System.out.println("Thank You For Returning The Book : " + bookName + ". Hope You Liked It. Have A Nice Day.\n");
        }
    }

    /**
     * This method shows all the books issued to the student.
     */
    public void showAllIssuedBooks() {
        if (numberOfIssuedBooks == 0) {
            System.out.println("No Book Has Been Issued To You Yet.");
        } else {
            if (numberOfIssuedBooks == 1) {
                System.out.println("1 Book has been issued to you till now :");
            } else {
                System.out.println(numberOfIssuedBooks + " Books have been issued to you till now : ");
            }
            for (int index = 0; index < numberOfIssuedBooks; index++) {
                System.out.println(namesOfIssuedBooks[index].getBookName());
            }
        }
        System.out.println();
    }
}