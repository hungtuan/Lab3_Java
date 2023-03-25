import java.util.Scanner;

public class Baitap5_3 {
    //ve hinh 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // đọc số lượng testcase
        for (int k = 0; k < t; k++) {
            int r = sc.nextInt(); // đọc số dòng
            int c = sc.nextInt(); // đọc số cột
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == 0 || i == r-1 || j == 0 || j == c-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            if (k < t - 1) {
                System.out.println(); // in ra dòng trống nếu chưa phải testcase cuối cùng
            }
        }
    }
}
