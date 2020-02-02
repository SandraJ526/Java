package learn.programming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonths(2, 2000));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0;
        } else {
            return false;
        }
    }

    public static int getDaysInMonths(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }

    }
}







