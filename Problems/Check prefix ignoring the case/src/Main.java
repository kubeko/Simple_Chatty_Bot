import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char stChar = str.charAt(0);
        System.out.println(stChar == 'j' || stChar == 'J');

    }
}