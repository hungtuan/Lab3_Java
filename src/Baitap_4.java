import java.util.Random;
import java.util.Scanner;

public class Baitap_4 {

    public static void gameShow(int n) {
        Random rand = new Random();
        int point = 10;
        int dem = 0;
        // Generate a random number between 0 and 9
        int item = rand.nextInt(10);
        // Start the game with an infinite loop
        while (true) {
            if (n > item) {
                point = point - 1;
                dem = dem + 1;
                if (point > 0) {
                    System.out.println("Giá mua nhập vào cao hơn giá trị giá bán");
                } else {
                    System.out.println("Bạn đã thất bại rồi:");
                    System.out.println("Điểm của bạn: " + point + "đ\nSố lần đoán sai: " + dem);
                    break;// End the game
                }
            }
            if (n < item) {
                point = point - 1;
                dem = dem + 1;
                if (point > 0) {
                    System.out.println("Giá mua nhập vào thấp hơn giá trị giá bán");
                } else {
                    System.out.println("Bạn đã thất bại rồi:");
                    System.out.println("Điểm của bạn: " + point + "đ\nSố lần đoán sai: " + dem);
                    break;// End the game
                }
            }
            if (n == item) {
                System.out.println("Bạn đã chọn đúng");
                System.out.println("Điểm của bạn: " + point + "đ\nSố lần đoán sai: " + dem);
                break;// End the game
            }
            System.out.println("Bạn chọn sai rồi nhập lại đi: ");
            n = Integer.parseInt(new Scanner(System.in).nextLine());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá bạn muốn đoán:");
        int n = sc.nextInt();
        gameShow(n);
    }
}
