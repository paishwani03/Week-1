import java.util.Scanner;

public class FeeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for fee
        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();

        // Prompt user for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate discounted fee
        double discountedFee = fee - discount;

        // Print results
        System.out.println("The discount amount is INR " + discount + 
                           " and the final discounted fee is INR " + discountedFee);
						   
		// Close the scanner object 
		sc.close();
    }
}
