import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = in.nextInt();
        
        if (x < a) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}