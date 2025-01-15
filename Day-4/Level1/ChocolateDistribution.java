import java.util.Scanner;

class ChocolateDistribution {
    // Method to distribute chocolates among children
    public int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates}; // Return results as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int Chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int Children = sc.nextInt();

        // Create an object of the ChocolateDistribution class
        ChocolateDistribution obj = new ChocolateDistribution();

        int[] result = obj.distributeChocolates(Chocolates, Children);

        // Display the result
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("The remaining chocolates are " + result[1] + ".");
    }
}
