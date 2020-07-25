import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < capacity; i++) {
            int el = scanner.nextInt();
            if (el % 6 == 0) {
                result += el;
            }
        }
        System.out.println(result);
    }
}