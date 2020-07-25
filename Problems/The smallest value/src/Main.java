
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long nFact = 1L;
        int i = 0;
        while (number >= nFact) {
            i++;
            nFact = nFact * i;
        }
        System.out.println(i);
    }
}
/*

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        BigInteger factorial = BigInteger.ONE;
        int n = 0;
        while (factorial.compareTo(BigInteger.valueOf(input)) <= 0) {
            n++;
            factorial = factorial.multiply(BigInteger.valueOf(n));
        }

        System.out.println("n =" + n + " factorial=" + factorial);
    }
}*/
