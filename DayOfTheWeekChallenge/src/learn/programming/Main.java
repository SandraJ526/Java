package learn.programming;

public class Main {

    /**
     * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
     * <p>
     * The method should not return any value (hint: void)
     * <p>
     * Using a switch statement print "Sunday", "Monday", "...", "Saturday" if the int parameter "day" is 0, 1, "..." , 6
     * respectively, otherwise it should print "Invalid day".
     * <p>
     * Bonus:
     * Write a second solution using if then else, instead of using switch.
     * Create a new project in IntelliJ with the  name "DayOfTheWeekChallenge"
     */

    public static void main(String[] args) {
        printDayOfTheWeek(15);
    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
