import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = 1;
        for (long i = a; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}