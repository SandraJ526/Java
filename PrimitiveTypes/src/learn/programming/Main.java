package learn.programming;

public class Main {

    public static void main(String[] args) {
        byte myChallengeByteValue = 10;
        short myChallengeShortValue = 20;
        int myChallengeIntValue = 50;
        long myChallengeLongValue = 50000L + 10L * (myChallengeByteValue + myChallengeShortValue + myChallengeIntValue);
        System.out.println(myChallengeLongValue);

        short shortTotal = (short) (1000 + 10 *
                (myChallengeByteValue + myChallengeShortValue + myChallengeIntValue));
    }
}
