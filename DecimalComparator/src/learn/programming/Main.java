package learn.programming;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-5.235,-5.2355));

    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){

        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);

        if (num1 == num2){
            return true;
        }
        return false;
    }


}
