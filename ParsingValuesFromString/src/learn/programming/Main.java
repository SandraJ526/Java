package learn.programming;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number +=1;

        System.out.println("numerAsString += 1 = " + numberAsString);
        System.out.println("number += 1 = " + number);
    }
}
