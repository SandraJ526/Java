package learn.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int value1, int value2) {

        if (value1 < 10 || value2 < 10) {
            return -1;
        }

        int greatestCommonDivisor = 1;

        for (int i = 1; i <= value1 && i <= value2; i++) {
            if (value1 % i == 0 && value2 % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
