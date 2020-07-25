import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int n1 = n % 10;
        int n10 = n / 10 % 10;
        int n100 = n / 100 % 10;
        int n1000 = n / 1000 % 10;

        if (n1000 == n1 && n10 == n100) {
            System.out.println(1);
        } else {
            System.out.println((int) (Math.random() * 100));
        }
    }
}
