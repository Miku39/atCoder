import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] S = new int[N];
        int[] T = new int[N];

        for (int i = 0; i < N; i++) {
           S[i] = in.nextInt();
        }
        for (int i = 0; i < M; i++) {
            T[i] = in.nextInt();
         }

        long count = 1;

        // ここに処理を書く
        
        count %= (Math.pow(10, 9) + 7);
        System.out.println(count);
    }
}