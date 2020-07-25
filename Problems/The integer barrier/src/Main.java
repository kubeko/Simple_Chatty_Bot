import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int el = scanner.nextInt();

            if (sum >= 1000) {
                sum -= 1000;
                break;
            } else if (el == 0) {
                break;
            }
            sum += el;
        }
        System.out.println(sum);
    }
}
