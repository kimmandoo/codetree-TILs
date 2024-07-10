import java.util.*;

public class Main {
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static boolean[][] v;
    static class Node{
        int ci, cj;
        Node(int i,int j){
            ci = i;
            cj = j;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        v = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        
        int res = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cnt = 0;
                for(int k=0; k<4; k++){
                    int ni = i + di[k];
                    int nj = j + dj[k];
                    if(ni<n&&ni>=0&&nj<n&&nj>=0){
                        if(map[ni][nj] == 1){
                           cnt++;
                        }
                    }
                }    
                if(cnt >= 3){
                    res++;
                }       
            }
        }        
        System.out.print(res);
    }
}