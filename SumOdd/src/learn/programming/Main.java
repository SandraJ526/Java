package learn.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }
    public static int sumOdd(int start, int end) {
        if (end >= start && start > 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            } return sum;
        }
        return -1;
    }
}


