package learn.programming;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4%3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("result++ = " + result);

        result--; // 2 - 1 = 1
        System.out.println("result-- = 2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result -= 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result *= 10; // result * 10
        System.out.println("2 * 10 = " + result);

        result /= 10; // result / 10
        System.out.println("20 / 10 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("Not afraid of aliens.");
        }

        int topScore = 80;
        if ( topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <=90)) {
            System.out.println("Either or both conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }

        //variable = (condition) ? expressionTrue :  expressionFalse;
//        int time = 20;
//        String result = (time < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);

//        or

//        int time = 20;
//        if (time < 18) {
//            System.out.println("Good day.");
//        } else {
//            System.out.println("Good evening.");
//        }

        //challenge

        double var1 = 20.00d;
        double var2 = 80.00d;
        double varTotal = (var1 + var2) * 100d;
        System.out.println("My varTotal = " + varTotal);
        double theRemainder = varTotal % 40.00d;
        System.out.println("The reminder = " + theRemainder);
        boolean noRemainder = (theRemainder == 0) ? true : false;
        System.out.println("noReminder = " + noRemainder);
        if (!noRemainder) {
            System.out.println("Got some reminder");
        }

    }

}
