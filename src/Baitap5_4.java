import java.util.Scanner;

public class Baitap5_4 {
    //Liet ke cac so nguyen to

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Các số nguyên tố trong khoảng từ " + a + " đến " + b + " là:");
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
