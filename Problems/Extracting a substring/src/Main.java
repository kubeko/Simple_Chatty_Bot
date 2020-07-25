import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        System.out.println(str.substring(scanner.nextInt(),
                scanner.nextInt() + 1));

    }
}