import java.util.*;

public class StoneGameIV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            boolean[] seen = new boolean[n + 1];
            for (int j = 1; j * j <= i; j++) {
                seen[a[i - j * j]] = true;
            }
            int g = 0;
            while (seen[g]) {
                g++;
            }
            a[i] = g;
        }

        if (a[n] != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
