import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        int resultQuantity = 0;

        resultQuantity = pairRounder(firstGroup) + pairRounder(secondGroup) + pairRounder(thirdGroup);
        System.out.println(resultQuantity);
    }

    public static int pairRounder(int n) {
        return n / 2 + n % 2;
    }
}
