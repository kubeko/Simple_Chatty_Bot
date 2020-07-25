import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = (double) scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double y = 0D;

        while (m < k) {
            m = m + m * p / 100;
            ++y;
        }
        System.out.println((int) y);

    }
}
