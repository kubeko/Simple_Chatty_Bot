import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int quantityOfUnits = new Scanner(System.in).nextInt();
        if (quantityOfUnits < 1) {
            System.out.println("no army");
        } else if (quantityOfUnits > 0 && quantityOfUnits < 20) {
            System.out.println("pack");
        } else if (quantityOfUnits > 19 && quantityOfUnits < 250) {
            System.out.println("throng");
        } else if (quantityOfUnits > 249 && quantityOfUnits < 1000) {
            System.out.println("zounds");
        } else if (quantityOfUnits > 999) {
            System.out.println("legion");
        }
    }//System.out.println(n < 1 ? "no army" : n < 20 ? "pack" : n < 250 ? "throng" : n < 1000 ? "zounds" : "legion");
}