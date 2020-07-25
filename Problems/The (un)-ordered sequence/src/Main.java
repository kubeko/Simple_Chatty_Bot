import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEl;
        int currentEl = 0;

        boolean ascending = true; // Is this sequence always ascending?
        boolean descending = true; // Is this sequence always descending?

        while ((inputEl = scanner.nextInt()) != 0) {

            if (currentEl == inputEl) {
                continue;

            } else if (currentEl == 0) {
                currentEl = inputEl;
                continue;

            } else if (inputEl > currentEl) {
                descending = false;
                if (!ascending) {
                    break;
                }

            } else if (inputEl < currentEl) {
                ascending = false;
                if (!descending) {
                    break;
                }
            }
            currentEl = inputEl;
        }
        System.out.println(ascending || descending);
    }
}