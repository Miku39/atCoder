import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String s = in.next();

        int outputInt = a + b + c;
        System.out.println(outputInt + " " + s);
    }
}