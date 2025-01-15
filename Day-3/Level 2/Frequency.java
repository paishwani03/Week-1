import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] frequency = new int[10]; // Array to store frequency of digits

        // Calculate frequency of each digit
        while (num != 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }

        // Display frequency of each digit
        System.out.println("Digit - Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("  " + i + "   -    " + frequency[i]);
            }
        }

        sc.close();
    }
}
