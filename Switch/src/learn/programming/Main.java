package learn.programming;

public class Main {

    public static void main(String[] args) {

        char charValue = 'O';

        switch (charValue) {
            case 'A': case 'B': case 'C': case 'D': case'E':
                System.out.println(charValue + " was found" );
                break;
            default:
                System.out.println("A, B, C, D or E not found. It's " + charValue + ".");
                break;


        }
    }
}
