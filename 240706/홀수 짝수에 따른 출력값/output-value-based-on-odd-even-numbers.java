import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(go(sc.nextInt()));
    }

    public static int go(int n){
        if(n<=2) return n;
        return n+go(n-2);
    }
}