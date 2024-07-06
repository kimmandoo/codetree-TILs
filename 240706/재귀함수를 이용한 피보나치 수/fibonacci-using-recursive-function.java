import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(fib(sc.nextInt()));
    }

    public static int fib(int n){
        if(n <= 2) return 1;

        return fib(n-1)+fib(n-2);
    }
}