import java.util.Scanner;

public class Palindrome {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object named input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
