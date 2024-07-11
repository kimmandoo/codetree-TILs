import java.util.*;

public class Main {
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1}; // 
    static int dir = 0; // L이면 왼쪽 회전, R이면 오른쪽 회전 
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] comm = sc.next().toCharArray();

        int[][] map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }    
        
        int ci = n/2;
        int cj = n/2;
        int sum = map[ci][cj];
        for(int i=0; i<t; i++){
            // t개의 명령
            char com = comm[i];
            if(com == 'F'){
                int ni = ci + di[dir];
                int nj = cj + dj[dir];
                if(ni < n && ni >= 0 && nj < n && nj >= 0){
                    sum += map[ni][nj];
                    ci = ni;
                    cj = nj;
                }
            }else{
                turn(com);
            }
        }    
        System.out.print(sum);

    }

    static void turn(char d){
        if(d == 'L'){
            if(dir != 0){
                dir--;
            }else{
                dir = 3;
            }
        }
        if(d == 'R'){
            if(dir != 3){
                dir++;
            }else{
                dir = 0;
            }
        }
    }
}