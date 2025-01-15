import java.util.Scanner;

class SimpleInterest {
    // Method to calculate Simple Interest
    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100; // Simple Interest formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for Principal, Rate, and Time
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Create an object 
        SimpleInterest obj = new SimpleInterest();

        // Calculate simple interest
        double simpleInterest = obj.calculate(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " +
                           principal + ", Rate of Interest " + rate + " and Time " + time + ".");
    }
}
