import java.util.Scanner;

class StudentGrades2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3]; // 2D array for marks (Physics, Chemistry, Maths)
        double[] percentages = new double[numStudents]; // Array for percentages
        char[] grades = new char[numStudents]; // Array for grades

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + ": ");
                int mark = sc.nextInt();

                // Validate marks
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    j--; // Retry the current subject input
                    continue;
                }

                marks[i][j] = mark;
                totalMarks += mark;
            }

            percentages[i] = totalMarks / 3.0; // Calculate percentage

            // Determine grade
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Display results
        System.out.println("Student | Physics | Chemistry | Maths | Percentage |  Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("   %d    |   %d    |    %d     |  %d   |   %.2f%%    |   %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
