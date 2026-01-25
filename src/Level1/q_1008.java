package Level1;
/*
첫째 줄에 A/B를 출력한다.
실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
 */
import java.util.Scanner;

public class q_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println((double)num1/num2);

        sc.close();
    }
}
