import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(calcSquare(a, b, c));
                break;
            case "rectangle":
                double aa = scanner.nextDouble();
                double bb = scanner.nextDouble();
                System.out.println(calcSquare(aa, bb));
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(calcSquare(r));
                break;
            default:
                System.out.println("Error> Wrong data. Please check your input");
        }
    }

    /**
     * calcSquare is an overloaded method for calculating the area from a triangle, circle and rectangle.
     *
     * @param a side A of triangle
     * @param b side B of triangle
     * @param c side C of triangle
     *
     * @return square of triangle.
     */
    public static double calcSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * @param a side A of rectangle
     * @param b side B of rectangle
     * @return square of rectangle
     */
    public static double calcSquare(double a, double b) {
        return a * b;
    }

    /**
     * @param r radius of circle
     * @return square of circle. Attention. Calculations are made with Pi coefficient = 3.14
     */
    public static double calcSquare(double r) {
        return 3.14 * r * r;
    }
}