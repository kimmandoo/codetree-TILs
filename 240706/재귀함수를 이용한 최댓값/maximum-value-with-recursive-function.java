import java.util.*;

public class Main {
    static int[] input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        input = new int[n];
        for(int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }
        System.out.print(f(n-1));

    }

    public static int f(int idx){
        if(idx == 0){
            return input[idx];
        }
        return Math.max(f(idx-1),input[idx]);
    }
}