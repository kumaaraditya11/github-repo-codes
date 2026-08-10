import java.util.*;

public class arraylinearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();

        int m = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                m = i;
                break;
            }
        }

        if (m == -1) {
            System.out.print("not found");
        } else {
            System.out.print("found at index " + m);
        }

    }
}
