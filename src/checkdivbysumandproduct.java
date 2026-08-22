import java.util.*;

public class checkdivbysumandproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }

        boolean result = (original % (sum + product) == 0);
        System.out.println(result);
    }
}
