import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inPutVar =  Integer.parseInt(scanner.next());
        int outPutVar = inPutVar / 10;

        System.out.println(outPutVar);
    }
}