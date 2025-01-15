import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int Count = 0;
        int temp = num;

        // Count digits
        while (temp != 0) {
            Count++;
            temp /= 10;
        }

        int[] digits = new int[Count];
        int index = 0;

        // Store digits in array
        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        // Display digits in reverse order
        System.out.println("Digits in reverse order:");
        for (int i = 0; i <= Count - 1; i++) {
            System.out.print(digits[i] + " ");
        }

        sc.close();
    }
}
