import java.util.Random;
import java.util.Scanner;

class StudentMarks {

    // Generate random scores for physics, chemistry, and math
    public int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // PCM for each student
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100) + 1; // Physics score
            scores[i][1] = rand.nextInt(100) + 1; // Chemistry score
            scores[i][2] = rand.nextInt(100) + 1; // Math score
        }
        return scores;
    }

    // Calculate the total, average, percentage, and grade for each student
    public double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // total, average, percentage, grade
        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][3] = getGrade(percentage);
        }
        return results;
    }

    // Assign grade based on percentage
    public char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R'; // Remedial
    }

    // Display scorecard for all students
    public void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + (char) results[i][3]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentMarks class
        StudentMarks studentMarks = new StudentMarks();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Generate random scores for each student
        int[][] scores = studentMarks.generateScores(numStudents);

        // Calculate results (total, average, percentage, grade)
        double[][] results = studentMarks.calculateResults(scores, numStudents);

        // Display the scorecard
        studentMarks.displayScorecard(scores, results, numStudents);
    }
}
