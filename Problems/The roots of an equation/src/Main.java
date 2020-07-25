import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 1;

        for (; x < 1001; x++) {
            if ( x * (a * x * x + b * x + c) == -d) {
                System.out.println(x);
            }

        }
    }
}