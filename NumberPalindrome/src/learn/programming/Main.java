package learn.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-111));
        System.out.println(isPalindrome(202));
        System.out.println(isPalindrome(1357));
    }
    public static boolean isPalindrome(int number) {

        if (number < 0) {               //if a number is negative, this statement removes minus sign in order
            number = Math.abs(number);          // to compare correctly the original number with reversed one
        }
        int startingNumber = number; //temporary variable to hold the number
        int reversedNumber = 0;
        int lastDigit; //last digit of the number

        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return startingNumber == reversedNumber; //returns true or false
    }
}
