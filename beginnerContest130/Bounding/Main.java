import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n+1跳ねる
        int n = in.nextInt();
        // x以下の領域
        int x = in.nextInt();

        // 個数
        int count = 1; // 1回目は0
        // 1つ前の座標
        int preD = 0;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            // 座標
            int d = preD + l;
            if (d <= x) {
                count++;
            }
            preD = d;
        }
        
       System.out.println(count);
    }
}