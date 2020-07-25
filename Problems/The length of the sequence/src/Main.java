import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int counter = 0;

        while (numb != 0) {
            numb = scanner.nextInt();
            counter++;
        }

        System.out.println(counter);

    }
}