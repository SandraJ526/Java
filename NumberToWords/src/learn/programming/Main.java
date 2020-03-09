package learn.programming;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
    }
    public static void numberToWords(int number) {
        int count = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");

        } else if (number == 0) {
            System.out.println("Zero");

        } else {
            number = reverse(number);

            while (count > 0) {
                int lastDigit = number % 10;
                number /= 10;

                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
                count--;
            }
        }
    }

    public static int reverse(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number >= 1) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}








