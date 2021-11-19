import java.util.Scanner;

public class Power {
    static int UsAlma(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * UsAlma(a, (b - 1));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Taban sayısını girin: ");
        int a = scn.nextInt();
        System.out.print("Üs sayısını girin: ");
        int b = scn.nextInt();
        System.out.println("İşlem sonucu: " +UsAlma(a, b));
    }
}
