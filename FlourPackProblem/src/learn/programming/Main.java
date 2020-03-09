package learn.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
        int result = 4 - (4 / 5) * 5;
        System.out.println(result);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigPackWeight = 5;
        int smallPackWeight = 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0 ||
                bigCount * bigPackWeight + smallCount * smallPackWeight < goal) {
            return false;
        }
        return smallCount >= goal - (goal / bigPackWeight) * bigPackWeight;
    }
}

