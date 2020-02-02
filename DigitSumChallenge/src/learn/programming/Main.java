package learn.programming;

public class Main {

    public static void main(String[] args) {
	/* Write a method with the name sumDigits that has one int parameter called number.

        If parameter is >= 10 then the method should process the number and return sum of all digits,
        otherwise return -1 to indicate an invalid value.

        The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process
        negative numbers, so also return -1 for negative numbers.

        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.

        Calling the method sumDigits(1) should return -1 as per requirements described above.

        Add some code to the main method to test out the sumDigits method to determine that it is working correctly
        for valid and invalid values passed as arguments.

        Hint:
        	Use n % 10 to extract the least-significant digit.
        	Use n = n / 10 to discard the least-significant digit.
        	The method needs to be static like other methods so far in the course.

        Tip:
        	Create a project with the name DigitSumChallenge. */

        System.out.println("The sum of the digits in number -11 is " + sumDigits(-11));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10; // same as number = number / 10
        }
        return sum;
    }

    /* Explanation
    Given the number 125.

    125 is greater than 0. Digit equals 125 % 10, which is 5. 5 is added to the sum, which is now 5.
    Number equals 125 divided by 10, which is 12 (not 12.5, because dividing ints truncates the quotient).
    12 is still greater than 0. digit equals 12 % 10, which is 2. 2 is added to the sum, which is now 7.
    Number equals 12 divided by 10, which is 1.
     */
}
