import java.util.*;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        go(sc.nextInt());
        System.out.print(cnt);
    }

    public static int go(int n){
        if(n < 2){
            return 1;
        }

        if(n%2 == 0){
            // 짝수
            cnt++;
            return go(n/2);
        }else{
            cnt++;
            return go(n/3);
        }
    }
}