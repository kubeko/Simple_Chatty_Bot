import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flowNum = scanner.nextInt();
        int largestElement = flowNum;
        while (flowNum != 0) {
            flowNum = scanner.nextInt();
            if (flowNum > largestElement) {
                largestElement = flowNum;
            }
        }
        System.out.println(largestElement);
    }
}