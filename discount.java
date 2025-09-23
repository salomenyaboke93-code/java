// J77-10533-2024 Salome Nyaboke

		import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount;

        // Prompt user to enter amount
        System.out.print("Enter the amount purchased: ");
        double amount = scanner.nextDouble();

        if (amount > 5000) {
            discount = amount * 0.1;   // 10% discount
        } else if (amount >= 1000 && amount <= 5000) {
            discount = amount * 0.05;  // 5% discount
        } else {
            discount = 0;              // No discount
        }

        double amountToPay = amount - discount;

        System.out.println("Initial amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + amountToPay);

        scanner.close();
    }
}
	
