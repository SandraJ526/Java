package learn.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sumOfTheEvenDigits = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            number /= 10;

            if (lastDigit % 2 == 0) {
                sumOfTheEvenDigits += lastDigit;
            }
        }
        return sumOfTheEvenDigits;
    }

}

