import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSequence = scanner.next();
        System.out.println(inputSequence.replace('a', 'b'));
    }
}
