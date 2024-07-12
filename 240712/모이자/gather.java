import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 1~n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, road(p, i));
        }
        System.out.print(min);        
    }

    static int road(int[] p, int kijun){
        int sum = 0;
        for(int i=0; i<p.length; i++){
            if(i!=kijun){
                sum += Math.abs(kijun - i)*p[i];
            }
        }
        return sum;
    }
}