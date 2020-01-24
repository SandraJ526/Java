package learn.programming;

public class Main {

    public static void main(String[] args) {

        System.out.println (hasEqualSum(1,1,2));

    }

    public static boolean hasEqualSum ( int num1, int num2, int sumOfNum1AndNum2){

        if (num1 + num2 == sumOfNum1AndNum2){
            return true;
        }
        return false;
    }
}
