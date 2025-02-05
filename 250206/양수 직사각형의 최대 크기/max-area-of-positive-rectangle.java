import java.util.*;
import java.io.*;

public class Main {
    static int n, m, max;
    static int[][] map;
    static boolean[][] v;
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        v = new boolean[n][m];
        max = -1;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                int cell = Integer.parseInt(st.nextToken());
                if(cell > 0) map[i][j] = 1; 
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j; l < m; l++) {
                        max = Math.max(max, go(i, j, k, l));
                    }
                }
            }
        }
        System.out.println(max);
    }

    static class Node{
        int i,j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

    public static int go(int i, int j, int k, int l) {
        int size = 0; 
        
        for (int r = i; r <= k; r++) { 
            for (int c = j; c <= l; c++) { 
                if (map[r][c] == 0) return -1;
                size ++;
            }
        }

        return size;
    }
}