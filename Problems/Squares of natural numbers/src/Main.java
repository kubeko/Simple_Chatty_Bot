import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int numb = new Scanner(System.in).nextInt();
        int i = 1;
        int squaredNumb = 1;

        while (squaredNumb <= numb) {
            System.out.println(squaredNumb);
            i = i + 1;
            squaredNumb = i * i;

        }
    }
}
