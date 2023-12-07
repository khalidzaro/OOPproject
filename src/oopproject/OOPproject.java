/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khalidzaro
 */
public class OOPproject {

    private static Scanner scanner = new Scanner(System.in);
    
         static List<Auther> authers = new ArrayList<>();
         static List<Book> books = new ArrayList<>();
         static ArrayList<Loan> loans = new ArrayList<>();

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         
       authers.add(new Auther(1234, "John Doe" ,"123 Main St", new DateOfBirth(1999, 11, 11)));
       
       
        System.out.println(authers);
        
        
         displayMenu();
        int option = selectOption();
        while (option != 0) {
            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    checkBookAvailability();
                    break;
                case 4:
                    checkBookLoans();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option from the menu.");
            }
            displayMenu();
            option = selectOption();
        }
        System.out.println("Thank you for using the Library Registration System.");
    }

    private static void displayMenu() {
        System.out.println("----------------------------------");
        System.out.println("Library Registration System");
        System.out.println("----------------------------------");
        System.out.println("1. Add Book");
        System.out.println("2. Search Book");
        System.out.println("3. Check Book Availability");
        System.out.println("4. Check Book Loans");
        System.out.println("0. Exit");
        System.out.println("----------------------------------");
        System.out.println("Please select an option: ");
    }

    private static int selectOption() {
    try {
        int option = scanner.nextInt();
        if (option < 0 || option > 4) {
            throw new InputMismatchException();
        }
        scanner.nextLine(); 
        return option;
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid option.");
        scanner.nextLine(); 
        return selectOption();
    }
}




private static void addBook() {
    System.out.print("Enter book NO: ");
    int NO = 0; 
    try {
        NO = Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Invalid input for book NO. Please enter a valid integer.");
        return;  
    }

    System.out.print("Enter book title: ");
    String title = scanner.nextLine();

    System.out.print("Enter book Author: ");
    String authorName = scanner.nextLine();
    Auther author = new Auther(1234, authorName, "123 Main St", new DateOfBirth(1999, 11, 11));

    System.out.print("Enter book Genre: ");
    String genre = scanner.nextLine();

    System.out.print("Enter book version: ");
    String version = scanner.nextLine();

    System.out.print("Enter book date: ");
    String dateString = scanner.nextLine();
    Date date = null;  
    try {

    
        date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    } catch (ParseException e) {
        System.out.println("Invalid date format. Please enter a valid date in the format yyyy-MM-dd.");
        return;  
    }

    Book book = new Book(NO, title, author, genre, version, date);
    books.add(book);
  
    System.out.println("Book added successfully.");
}


   private static void searchBook() {
    System.out.print("Enter search term: ");
    String searchTerm = scanner.nextLine();

    System.out.println("Search Results:");
    for (Book book : books) {
        String noString = String.valueOf(book.getNO());  
        Auther author = book.getAuther(); 

        if (book.getTitle().toLowerCase().contains(searchTerm.toLowerCase())
                || author.getName().toLowerCase().contains(searchTerm.toLowerCase())
                || noString.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println(book);
        }
    }
}

   private static Book findBookByNO(int NO) {
    for (Book book : books) {
        if (book.getNO() == NO) {
            return book;
        }
    }
    return null;
}

    
private static void checkBookAvailability() {
    System.out.print("Enter book NO: ");
    int NO = 0;  
    try {
        NO = Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Invalid input for book NO. Please enter a valid integer.");
        return;  
    }

    Book book = findBookByNO(NO);
    if (book != null) {
        if (book.inLoan()) {  
            System.out.println("Book is currently on loan.");
        } else {
            System.out.println("Book is available.");
        }
    } else {
        System.out.println("Book not found.");
    }
}


        private static String getBookTitleByNO(int NO) {
    for (Book book : books) {
        if (book.getNO() == NO) {
            return book.getTitle();
        }
    }
    return "Unknown Title";  
}


        
        private static void checkBookLoans() {
        System.out.println("Active Loans:");
        int loanListSize = loans.size();
        if(loanListSize>0){
        for (Loan loan : loans) {
            System.out.println("Borrower: " + loan.getBorrowerName() +
                    ", Book: " + getBookTitleByNO(loan.getNO()) +
                    ", Loan Date: " + loan.getLoanDate() +
                    ", Due Date: " + loan.getDueDate());
        }
        }
        else System.out.println("NO books in loan ");
    }
    
        

    
}
