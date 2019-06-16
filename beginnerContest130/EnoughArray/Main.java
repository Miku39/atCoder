import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
           A[i] = in.nextInt();
        }

        long count = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += A[j];
                if (sum >= K) {
                    count += (N - j);
                    break;
                }
            }
        }

        System.out.println(count);
    }
}