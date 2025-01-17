import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {
        // Get the current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Get the current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Get the current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
    }
}
