public class EarthVolume {
    public static void main(String[] args) {
        // Define radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor from kilometers to miles
        double kmToMiles = 1.6;

        // Calculate the volume of Earth in cubic kilometers
        double volKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles
        double volMiles = volKm / Math.pow(kmToMiles, 3);

        // Print the results
        System.out.println("The volume of Earth in cubic kilometers is " + volKm +
                           " and in cubic miles is " + volMiles);
    }
}
