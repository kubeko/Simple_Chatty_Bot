import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean result = false;
        char[] vowelArr = new char[5];
        vowelArr[0] = 'A';
        vowelArr[1] = 'E';
        vowelArr[2] = 'I';
        vowelArr[3] = 'O';
        vowelArr[4] = 'U';

        for (char i : vowelArr) {
            if (ch == i || ch == i + 32) {
                result = true;
                break;
            }
        }
        return  result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}