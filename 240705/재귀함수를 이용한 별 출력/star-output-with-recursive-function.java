import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);

    }
    public static void star(int n){
        if(n<1){
            return;
        }
        
        star(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}