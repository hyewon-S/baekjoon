package Level2;
import java.util.Scanner;

public class q_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m<45) {
            m = m + 15;
            h--;
            if(h == -1) {
                h = 23;
            }
        } else { //m은 45분 ~ 59분
            m = m - 45;
        }
        System.out.println(h + " " + m);
        sc.close();
    }
}
