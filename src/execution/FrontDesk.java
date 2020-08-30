/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_BOOKS = 3;
    private static final int EXIT = 4;
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int endUserInput;
        Student student1 = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issued book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            /*
             * This try-catch is used here in order to handle the exception when the user enters a string by mistake.
             * This will prevent the program to stop in that case and the default condition of switch case will work.
             */
            try {
                endUserInput = scannerObject.nextInt();
            } catch (Exception e) {
                endUserInput = 0;
                scannerObject.nextLine();
            }
            switch (endUserInput) {
                case ISSUE_BOOK:
                    System.out.println("Please Enter The Name Of The Book That You Want To Issue : ");
                    scannerObject.nextLine();
                    String bookName = scannerObject.nextLine();
                    student1.issueBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Please Enter The Name Of The Book That You Want To Return : ");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    student1.returnBook(bookName);
                    break;
                case SHOW_BOOKS:
                    student1.showAllIssuedBooks();
                    break;
                case EXIT:
                    System.out.println("Thanks For Coming. Please, Come Back Later.");
                    break;
                default:
                    System.out.println("Wrong Choice.\nPlease Choose Between 1 - 4 Only.");
            }
        } while (endUserInput != EXIT);
        scannerObject.close();
    }
}