import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        LocalDate inputDate = LocalDate.of(2025, 1, 1);
        System.out.println("Input date: " + inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
