import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        compareStrings(str1, str2);
    }

    // Function to compare two strings lexicographically
    public static void compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2);
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str1 + " comes after " + str2);
                return;
            }
        }

        if (str1.length() == str2.length()) {
            System.out.println(str1 + " is equal to " + str2);
        } else if (str1.length() < str2.length()) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }
    }
}
