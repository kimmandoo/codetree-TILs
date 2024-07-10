import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        Arrays.sort(a);
        Arrays.sort(a);
        int len = a.length;
        int lenB = b.length;
        if(len < lenB) len = lenB; 
        boolean t = true; 
        for(int i=0; i< len; i++){
            if(a[i] != b[i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }   
}