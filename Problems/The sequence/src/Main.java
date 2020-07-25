import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityNumb = scanner.nextInt();
        int i = 1;
        int maxIterNumb = 0;

        while (i <= quantityNumb) {
            int iterNumb = scanner.nextInt();
            if (iterNumb % 4 == 0 && iterNumb > maxIterNumb) {
                maxIterNumb = iterNumb;
            }
            i++;
        }
        System.out.println(maxIterNumb);
    }
}