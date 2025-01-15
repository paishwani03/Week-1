import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt user for unit price and quantity
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);
		// Close the scanner object 
		input.close();
    }
}
