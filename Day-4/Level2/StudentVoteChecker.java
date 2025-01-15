import java.util.Scanner;

class StudentVoteChecker {
    // Method to check voting eligibility
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();

        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = obj.canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") - " + (canVote ? "Can Vote" : "Cannot Vote"));
        }
    }
}
