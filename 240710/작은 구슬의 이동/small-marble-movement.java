import java.util.*;

public class Main {
    static int[] di = {-1,1,0,0};
    static int[] dj = {0,0,-1,1}; // 상, 하 좌, 우 순서대로
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt(); // t초가 지난뒤의 구슬 위치를 뽑아야됨
        int ci = sc.nextInt();
        int cj = sc.nextInt();
        String d = sc.next();
        int dir = "UDLR".indexOf(d); // 이런거는 또 처음 본다,. 

        for (int i = 0; i < t; i++) {
            int ni = ci + di[dir];
            int nj = cj + dj[dir];

            if (ni < 1 || ni > n || nj < 1 || nj > n) {
                if(dir == 0) dir = 1;
                else if(dir == 1) dir = 0;
                else if(dir == 2) dir = 3;
                else if(dir == 3) dir = 2;                
            } else {
                ci = ni;
                cj = nj;
            }
        }
        System.out.print(ci + " " + cj);
        // 벽에 부딪히면 반대방향으로 간다.
        // 근데 1초의 시간이 걸림(부딪히고, 1초는 가만히 있고, 그리고 진행)
    }
}