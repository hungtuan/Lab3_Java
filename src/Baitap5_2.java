import java.util.Scanner;

public class Baitap5_2 {
    //Ve hinh 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // đọc số lượng testcase
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt(); // đọc số dòng
            int c = sc.nextInt(); // đọc số cột
            for (int j = 1; j <= r; j++) {
                for (int k = 1; k <= c; k++) {
                    if ((j + k) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println(); // xuống dòng khi hoàn thành một hàng
            }
            if (i < t - 1) {
                System.out.println(); // in ra dòng trống nếu chưa phải testcase cuối cùng
            }
        }
    }
}
