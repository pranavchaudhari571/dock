public class SumOfDigits {
    public static void main(String[] args) {
        // Hardcoded value for testing
        int number = 987654321;

        // Find the sum of its digits
        int sum = findSumOfDigits(number);

        // Display the result
        System.out.println("Sum of digits for " + number + ": " + sum);
    }

    private static int findSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
