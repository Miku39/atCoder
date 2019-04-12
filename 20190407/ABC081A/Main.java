import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String[] ints = input.split("");
        
        int count = 0;
        for (String s : ints) {
            if (s.equals("1")) {
                count++;
            }
        }

        System.out.println(count);

    }
}