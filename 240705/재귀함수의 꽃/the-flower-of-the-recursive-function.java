import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        f(sc.nextInt());
    }

    public static void f(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        f(n-1);
        System.out.print(n+" ");
    }
}