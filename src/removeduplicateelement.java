import java.util.*;

public class removeduplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
