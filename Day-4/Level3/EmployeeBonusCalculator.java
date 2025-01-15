import java.util.Random;

public class EmployeeBonusCalculator {
    
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);
        displayEmployeeData(employeeData, updatedEmployeeData);
    }

    // Generate random salary and years of service for each employee
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] data = new double[numberOfEmployees][2];
        Random random = new Random();
        
        for (int i = 0; i < numberOfEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            data[i][1] = 1 + random.nextInt(10);        // Random years of service between 1 and 10
        }
        return data;
    }

    // Calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] newData = new double[data.length][3];
        
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double yearsOfService = data[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            newData[i][0] = oldSalary;
            newData[i][1] = newSalary;
            newData[i][2] = bonusAmount;
        }
        return newData;
    }

    // Display the data in a tabular format
    public static void displayEmployeeData(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0, sumNewSalary = 0, totalBonus = 0;
        
        System.out.printf("%-10s %-10s %-15s %-15s %-10s\n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < oldData.length; i++) {
            sumOldSalary += newData[i][0];
            sumNewSalary += newData[i][1];
            totalBonus += newData[i][2];
            
            System.out.printf("%-10d %-10.2f %-15.2f %-15.2f %-10.2f\n", 
                i + 1, 
                newData[i][0], 
                oldData[i][1], 
                newData[i][1], 
                newData[i][2]);
        }
        
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-15s %-15.2f %-10.2f\n", "Total", sumOldSalary, "", sumNewSalary, totalBonus);
    }
}
