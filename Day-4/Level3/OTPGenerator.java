import java.util.HashSet;
public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Ensures a 6-digit number
    }

    // Method to ensure that OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness of the OTPs
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
