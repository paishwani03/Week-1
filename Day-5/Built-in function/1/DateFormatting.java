import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date as dd/MM/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date in format dd/MM/yyyy: " + currentDate.format(formatter1));

        // Format the date as yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Date in format yyyy-MM-dd: " + currentDate.format(formatter2));

        // Format the date as EEE, MMM dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Date in format EEE, MMM dd, yyyy: " + currentDate.format(formatter3));
    }
}
