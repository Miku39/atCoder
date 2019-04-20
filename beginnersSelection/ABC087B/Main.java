import java.util.Scanner;

class Main {
    public static void main(String[] argas) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();  // 500 yen
        int b = in.nextInt();  // 100 yen
        int c = in.nextInt();  // 50 yen
        int x = in.nextInt();

        int count = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int amount = (500 * i) + (100 * j) + (50 * k);
                    if (amount == x) {
                       count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}