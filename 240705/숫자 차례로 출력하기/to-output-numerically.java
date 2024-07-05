import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p2(1,n);
        System.out.println();
        p1(1,n);
    }

    public static void p1(int n, int size){
        if(n==size){
            System.out.print(n+" ");
            return;
        }
        p1(n+1, size);
        System.out.print(n+" ");
    }
    public static void p2(int n, int size){
        if(n==size){
            System.out.print(n+"");
            return;
        }
        System.out.print(n+" ");
        p2(n+1, size);
    }
}