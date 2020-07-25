import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInputString = scanner.nextLine().replace(" ", "");
        String secondInputString = scanner.nextLine().replace(" ", "");
        System.out.println(firstInputString.equals(secondInputString));

    }
}