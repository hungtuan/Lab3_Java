public class Baitap_3 {

    public static void roomPlan(int m, int n) {
        System.out.println("                            SƠ ĐỒ CHỖ NGỒI");
        //hien thu "==="
        for (int l = 0; l < 77; l++) {
            System.out.print("=");
        }
        System.out.print("\n");
        System.out.println("                            MÀN HÌNH");
        //hien thu "==="
        for (int l = 0; l < 77; l++) {
            System.out.print("=");
        }
        System.out.print("\n");
        //slots
        for (char c = 'A'; c <= 'K'; c++) {
            System.out.print(c + "      ");
            for (int i = 0; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    String num = String.format("%02d", i * n + j);
                    System.out.print("[" + num + "]  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        roomPlan(0, 12);
    }
}

