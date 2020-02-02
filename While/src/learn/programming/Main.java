package learn.programming;

public class Main<finishNumber> {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(6));

        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

        //same result with for loop
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("****************");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1; //if count = 6, it would execute until value is 100 (inclusive)
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("****************");

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);


        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;


    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}