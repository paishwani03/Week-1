import java.util.Arrays;

class RandomNumber {
    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random number
        }
        return numbers;
    }

    // Method to calculate average, min, and max of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumber obj = new RandomNumber();

        // Generate an array of random numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] results = obj.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
