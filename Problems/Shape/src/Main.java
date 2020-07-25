import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String shape = "There is no such shape!";
        String answer = "You have chosen a ";
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":
                shape = "square";
                break;
            case "2":
                shape = "circle";
                break;
            case "3":
                shape = "triangle";
                break;
            case "4":
                shape = "rhombus";
                break;
            default:
                answer = "";
                break;
        }
        System.out.println(answer + shape);
    }
}