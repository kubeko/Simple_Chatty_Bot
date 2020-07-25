import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xWhite = scanner.nextInt();
        int yWhite = scanner.nextInt();
        int xBlack = scanner.nextInt();
        int yBlack = scanner.nextInt();

        if (xWhite == xBlack || yWhite == yBlack || Math.abs(xWhite - xBlack) == Math.abs(yWhite - yBlack)) {
            System.out.println("YES");
        } else {
            System.out.print("NO");
        }
    }
}
