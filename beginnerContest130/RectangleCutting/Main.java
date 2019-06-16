import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();

        double maxArea = W * H / 2;

        int x = in.nextInt();
        int y = in.nextInt();

        int isMultiple = 0;
        if (x == W / 2 && y == H /2) {
            isMultiple = 1;
        }
        
       System.out.println(maxArea + " " + isMultiple);
    }
}