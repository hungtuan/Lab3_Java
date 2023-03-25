import java.util.Scanner;

public class Baitap5_1 {

    public static void drawSquare(int t) {
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                if (j == 1 || j == t || i == 1 || i == t||i==j) {
                    System.out.print("*" );
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Nhập vào t:");
        t = sc.nextInt();
        while (t <= 0 || t >= 10) {
            System.out.println("Nhập lại t đi(0<t<10):");
            t = new Scanner(System.in).nextInt();
        }
        drawSquare(t);
    }
}
