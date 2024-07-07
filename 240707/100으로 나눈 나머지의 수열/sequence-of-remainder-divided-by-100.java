import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(sequence(sc.nextInt()));
    }

    public static int sequence(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 4;
        } else {
            return (sequence(n-1) * sequence(n-2)) % 100;
        }
    }
}