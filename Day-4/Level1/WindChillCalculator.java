import java.util.Scanner;

class WindChillCalculator {
    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Create an object of the WindChillCalculator class
        WindChillCalculator obj = new WindChillCalculator();

        // Calculate the wind chill
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is " + windChill + "°F.");
    }
}
