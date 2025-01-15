import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empCount = 10;
        double[] salary = new double[empCount];
        double[] years = new double[empCount];
        double[] bonus = new double[empCount];
        double[] newSalary = new double[empCount];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salary and years of service
        for (int i = 0; i < empCount; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double sal = sc.nextDouble();
            double yr = sc.nextDouble();

            if (sal < 0 || yr < 0) {
                System.out.println("Invalid input, enter positive values.");
                i--; // Decrement index to re-enter data
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
            totalOldSalary += sal;

            // Calculate bonus
            bonus[i] = (yr > 5) ? sal * 0.05 : sal * 0.02;
            newSalary[i] = sal + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("Employee-wise Details:");
        for (int i = 0; i < empCount; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                               ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
