import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     * 
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0;

        while (from < to) {
            sum = sum + from++;
        }
        return  sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    } 
}
/*
    public static long sumInRange(int from, int to) {
        // write your code here
        long n;
        long s;
        n = to - from;
        s = ((from + to) * n - n) / 2;
        return s;*/