import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int el;

        do {
            el = scanner.nextInt();
            sum += el;
        } while (el != 0);

        System.out.println(sum);
    }

}