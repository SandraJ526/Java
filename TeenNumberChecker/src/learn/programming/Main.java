package learn.programming;

import org.w3c.dom.ranges.Range;

import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(10, 35, 14));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen (int age) {
        return age >=13 && age <= 19;
    }
}

