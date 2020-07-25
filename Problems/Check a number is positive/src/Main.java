import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = a <= 0 ? "NO" : "YES";
        System.out.println(result);

    }
}
