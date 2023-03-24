import java.util.Scanner;

public class Baitap_1 {

    public static void printNumber1(int n) {
        //In dãy số 1, 2, 3, …, N.
        String delimiter = "";
        for (int i = 0; i <= n; i++) {
            System.out.print(delimiter + i);
            delimiter = ", ";
        }
        System.out.println(".");
    }

    public static void printNumber2(int n) {
        //In dãy số N, N-1, N-2, … 1.
        String delimiter = "";
        for (int i = n; i > 0; i--) {
            System.out.print(delimiter + i);
            delimiter = ", ";
        }
        System.out.println(".");
    }

    public static void printNumber3(int n) {
        //In dãy số 1, 3, 5, …, N.
        String delimiter = "";
        for (int i = 1; i <=n; i+=2) {
            System.out.print(delimiter + i);
            delimiter = ", ";
        }
        System.out.println(".");
    }

    public static void printNumber4(int n) {
        // In dãy số 2, 4, 6, …, N.
        String delimiter = "";
        for (int i = 2; i <=n; i+=2) {
            System.out.print(delimiter + i);
            delimiter = ", ";
        }
        System.out.println(".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        int n = sc.nextInt();
        printNumber1(n);
        printNumber2(n);
        printNumber3(n);
        printNumber4(n);


    }
}