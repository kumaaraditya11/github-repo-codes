import java.util.*;

public class StoneGameIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }

        boolean aliceWins;
        if (count[0] % 2 == 0) {
            aliceWins = count[1] > 0 && count[2] > 0;
        } else {
            aliceWins = Math.abs(count[1] - count[2]) > 2;
        }

        System.out.println(aliceWins);
    }
}
