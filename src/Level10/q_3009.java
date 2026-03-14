package Level10;

import java.util.Scanner;

public class q_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        int d1, d2;
        if(a1 == b1) {
            d1 = c1;
        } else if(b1 == c1) {
            d1 = a1;
        } else {
            d1 = b1;
        }

        if(a2 == b2) {
            d2 = c2;
        } else if(b2 == c2) {
            d2 = a2;
        } else {
            d2 = b2;
        }

        System.out.println(d1 + " " + d2);

        sc.close();
    }
}
