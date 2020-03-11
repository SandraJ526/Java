package learn.programming;

public class Main {

    public static void main(String[] args) {

        printSquareStarNumbers(20);

    }
    public static void printSquareStarNumbers(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 ) System.out.print("1"); // horizontal first line
                    else if (i == number) System.out.print("2"); // horizontal last line
                    else if (j == 1) System.out.print("3"); // vertical left line
                    else if ( j == number) System.out.print("4"); // vertical right line
                    else if (i == j) System.out.print("5"); // left to right diagonal
                    else if (j == (number - i + 1)) System.out.print("6"); // right to left diagonal

                    else
                        System.out.print(" "); //space
                }
                System.out.println(); //next line
            }
        }
    }
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");

        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {

                    if (i == 1 || i == number || j == 1 || j == number || i == j ||j == (number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
