import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();

        if (aSide + bSide > cSide && aSide + cSide > bSide && bSide + cSide > aSide) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}