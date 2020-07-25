import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inPut1 = scanner.nextInt();
        reversDigit(inPut1);
    }

    public static void reversDigit(int n) {
        int resultRevers = (n % 10) * 100 + ((n / 10) % 10) * 10 + n / 100;
        System.out.println(resultRevers);
    }

}
