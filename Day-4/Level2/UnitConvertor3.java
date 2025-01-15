class UnitConvertor3 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(98.6));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(150));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(68));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(5));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(10));
    }
}
