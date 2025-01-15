public class Fees{
     public static void main(String args[]){

        // Define fee and discount percentage
        double fee = 125000, discountPercent = 10;

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate discounted fee
        double discountedFee = fee - discount;

        // Print results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountedFee);
    }
}
