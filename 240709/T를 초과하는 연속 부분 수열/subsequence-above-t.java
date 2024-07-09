import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // t보다 큰 수로만 이루어진 연속부분 수열 중 최대길이
        int max = 0;
        int cnt = 1;
        if(arr[0] < t) {
            cnt = 0;
            max = 0;
        }
        for(int i=1; i<n; i++){
            if(arr[i-1]<arr[i] && arr[i] > t && arr[i-1] > t){
                cnt++;
            }else{
                cnt = 1;
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}