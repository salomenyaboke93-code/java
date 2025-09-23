//J77-10533-2024  Salome Nyaboke
import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter Book ID: ");
        String bookID = input.nextLine();

        System.out.print("Enter Due Date : ");
        int dueDate = input.nextInt();

        System.out.print("Enter Return Date : ");
        int returnDate = input.nextInt();

        // Calculate days overdue
        int daysOverdue = returnDate - dueDate;

        int fineRate;
        int fineAmount;

        if (daysOverdue <= 0) {
            fineRate = 0;
            fineAmount = 0;
            daysOverdue = 0; // not overdue
        } else if (daysOverdue <= 7) {
            fineRate = 20;
            fineAmount = daysOverdue * fineRate;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
            fineAmount = daysOverdue * fineRate;
        } else {
            fineRate = 100;
            fineAmount = daysOverdue * fineRate;
        }

        // Output
        System.out.println("\n--- Library Fine Details ---");
        System.out.println("Book ID:       " + bookID);
        System.out.println("Due Date:       " + dueDate);
        System.out.println("Return Date:    " + returnDate);
        System.out.println("Days Overdue:  " + daysOverdue);
        System.out.println("Fine Rate:     Ksh. " + fineRate);
        System.out.println("Fine Amount:   Ksh. " + fineAmount);

        input.close();
    }
}