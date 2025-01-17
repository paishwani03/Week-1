import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);

        System.out.println("Modified string: " + removeCharacter(input, charToRemove));
    }

    // Function to remove a specific character
    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
}
