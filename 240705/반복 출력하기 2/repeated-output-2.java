import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        p(sc.nextInt());
    }

    public static void p(int n){
        if(n==0) return;
        p(n-1);
        System.out.println("HelloWorld");
    }
}