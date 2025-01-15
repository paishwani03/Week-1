import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[][] marks = new double[numStudents][3]; // 2D array for marks
        double[] percentages = new double[numStudents]; // Array for percentages
        char[] grades = new char[numStudents]; // Array for grades

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " - ");
            double totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                double mark = sc.nextDouble();

                // Validate marks
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    j--; // Retry the current subject input
                    continue;
                }

                marks[i][j] = mark;
                totalMarks += mark;
            }

            percentages[i] = totalMarks / 3; // Calculate percentage

            // Determine grade
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Display results
        System.out.println("Student | Percentage |  Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("   %d    |    %.2f%%   |   %c%n", (i + 1), percentages[i], grades[i]);
        }

        sc.close();
    }
}
