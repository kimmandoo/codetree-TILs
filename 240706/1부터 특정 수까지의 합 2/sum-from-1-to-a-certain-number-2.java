import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(s(1, sc.nextInt()));
    }

    public static int s(int n, int s){
        if(n == s){
            return n;
        }

        return n + s(n+1, s);
    }
}