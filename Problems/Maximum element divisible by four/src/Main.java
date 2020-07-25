import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int elMaxDiv4 = 0;
        for (int i = 0; i < capacity; i++) {
            int el = scanner.nextInt();
            if (el % 4 == 0 && el > elMaxDiv4) {
                elMaxDiv4 = el;
            }
        }
        System.out.println(elMaxDiv4);
    }
}
