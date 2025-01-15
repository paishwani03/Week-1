class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        double km = 10.0;
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");

        double miles = 5.0;
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        double meters = 20.0;
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        double feet = 15.0;
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
