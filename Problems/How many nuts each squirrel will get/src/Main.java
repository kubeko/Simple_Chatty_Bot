import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrel = scanner.nextInt();
        int nut = scanner.nextInt();

        if ((squirrel <= 10000) && (nut <= 10000)) {
            int equalQuantity = nut / squirrel;

            System.out.println(equalQuantity);

        }
    }
}