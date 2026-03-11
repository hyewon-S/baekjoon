package Level2;
import java.util.Scanner;

/*
첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.

첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
 */
public class q_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp; //temp에는 나머지를 저장해둠
        if(c >= 60) { //c가 60이상이면
            a += c / 60;
            temp = c % 60;
        } else {
            temp = c;
        }

        b += temp; //분을 일단 더해줌

        if(b >= 60) { //분이 60이 넘는지 확인
            b -= 60;
            a++;
//            if(a == 24) { a = 0; } -> 오류 1차 해결 : 기존에 틀린 부분 (24이상으로 당연히 넘어갈 것을 생각 못했다!!)
//            if (a >= 24) { a -= 24;} -> 오류 2차 해결 : 이 문장은 if문 밖으로 빠져야 함 -> b가 넘치지 않는데 a만 넘치는 경우가 존재함
        }

        if( a >= 24) {
            a -= 24;
        }
        System.out.println(a + " " + b);
        sc.close();
    }
}
