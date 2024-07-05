import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(go(sc.nextInt()));
    }

    public static int go(int n){
        // 각 자리수의 제곱 합이 중요함
        if(n<10){
            return n*n;
        }
        return go(n/10)+(n%10)*(n%10);
    }
}