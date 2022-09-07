import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        sayi2 = scan.nextInt();
        System.out.print(recursiveUsAlma(sayi1, sayi2));
    }
    private static int recursiveUsAlma(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (a == 1) {
            return 1;
        } else {
            return a * recursiveUsAlma(a, n - 1);
        }
    }
}
