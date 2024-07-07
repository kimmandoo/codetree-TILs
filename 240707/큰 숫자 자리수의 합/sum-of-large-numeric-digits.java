import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(f(a*b*c));
    }

    public static int f(int n){
        // 각 자리수를 잘라서 반환해야됨
        // end
        if(n <10){
            return n;
        }

        return f(n/10)+n%10;
    }
}