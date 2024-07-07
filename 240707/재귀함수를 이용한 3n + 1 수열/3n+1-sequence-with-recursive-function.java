import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print(f(sc.nextInt(),0));
    }

    public static int f(int n, int cnt){
        if(n==1){
            return cnt;
        }

        if(n%2==0){
            return f(n/2,cnt+1);
        }else{
            return f(n*3+1, cnt+1);
        }
    }
}