import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1] == arr[i]) cnt++;
            else cnt = 1;
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}