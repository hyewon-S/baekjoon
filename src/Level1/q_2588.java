package Level1;

import java.util.Scanner;

public class q_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result1 = num1 * (num2 % 10);
        num2 = num2 / 10;
        int result2 = num1 * (num2 % 10);
        num2 = num2 / 10;
        int result3 = num1 * (num2 % 10);
        num2 = num2 / 10;
        int result4 = result1 + result2 * 10 + result3 * 100;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        sc.close();
    }
}
