import java.util.*;

public class Main {
    static int[] input;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        input = new int[n];
        for(int i=0; i<n;i++){
            input[i] = sc.nextInt();
        }

        System.out.print(go(0));
    }

    public static int go(int n){
        if(n==input.length-1){
            return input[n];
        }
        return lcm(input[n], go(n+1));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소 공배수(LCM)를 구하는 메소드
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    
}