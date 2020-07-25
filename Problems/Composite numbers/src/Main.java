import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        if (number <= 3) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        }
        for (int i = 3; i <= Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) {

                return true;
            }
        }
        return false;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}