import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] numberList = new int[number];
        for (int i = 0; i < number; i++) {
            numberList[i] = in.nextInt();
        }

        int count = 0;
        boolean isAllEven = true;
        while (isAllEven) {
            for (int i = 0; i < number; i++) {
                if (numberList[i] % 2 == 0) {
                    numberList[i] = numberList[i] / 2;
                } else {
                    isAllEven = false;
                    break;
                }
            }

            count++;
        }

        System.out.println(count - 1);
    }
}