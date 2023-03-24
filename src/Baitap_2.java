import java.math.BigInteger;
import java.util.Scanner;

public class Baitap_2 {

    public static BigInteger getFactorial(int n) {
        //S1 = Giai thừa của số nguyên N.
        BigInteger giaithua = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua.multiply(BigInteger.valueOf(i));
        }
        return giaithua;
    }

    public static BigInteger sumFactorial(int n) {
        //S2 = 1! + 2! + 3! + … + N!
        BigInteger giaithua = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua.multiply(BigInteger.valueOf(i));
            sum = sum.add(giaithua);
        }
        return sum;
    }

    public static int printNumber(int n) {
        //Đếm và in ra số lượng các số nguyên chia hết cả 3 và 7 trong phạm vi từ 1 – N
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có số nào chia hết cho cả 3 và 7 trong phạm vi từ 1 đến " + n);
        } else {
            System.out.println("\nCó " + count + " số nguyên chia hết cho cả 3 và 7 trong phạm vi từ 1 đến " + n);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào n:");
            n = sc.nextInt();
        } while (n < 0);
        BigInteger result = getFactorial(n);
        BigInteger result1 = sumFactorial(n);
        int result2 = printNumber(n);
        System.out.println(n + "! = " + result);//1 2 6 24 120
        System.out.println("Tổng " + n + "! = " + result1);

    }
}
