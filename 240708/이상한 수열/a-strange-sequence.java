import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(f(sc.nextInt()));
    }

    public static int f(int n){
        // N을 준다
        // 1, 2, 1/3번째 수 + 바로 직전 수
        if(n <= 2) return n;
        return f(n/3)+f(n-1);
    }
}