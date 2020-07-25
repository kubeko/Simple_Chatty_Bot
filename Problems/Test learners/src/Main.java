import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        int question;
        while (scanner.hasNext() && !stop) {
            question = scanner.nextInt();
            switch (question) {
                case 1:
                    qPrint("Yes!");
                    stop = true;
                    break;
                case 2:
                case 3:
                case 4:
                    qPrint("No!");
                    break;
                default:
                    qPrint("Unknown number");
                    break;
            }

        }
    }

    public static void qPrint(String s) {
        System.out.println(s);
    }
/*import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            switch (new Scanner(System.in).nextLine()) {
                case "1":
                    System.out.println("Yes!");
                    break;
                case "2":
                case "3":
                case "4":
                    System.out.println("No!");
                    break;
                default:
                    System.out.println("Unknown number");
            }
        }
    }*/
}