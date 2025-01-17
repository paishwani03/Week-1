import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("String after removing duplicates: " + removeDuplicates(input));
    }

    // Function to remove duplicate characters
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
