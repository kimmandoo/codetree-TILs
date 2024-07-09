import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n*2];
        for(int i=0; i<n*2;i++){
            input[i]=sc.nextInt();
        }
        System.out.print(minMax(input));
    }

    public static int minMax(int[] input){
        int n = input.length/2;
        Arrays.sort(input);

        int min=0;
        for (int i = 0; i < n; i++) {
            min = Math.max(min, input[i] + input[2*n-1-i]);
        }
        return min;
    }
}