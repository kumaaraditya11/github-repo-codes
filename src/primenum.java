import java.util.*;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                break;
            }
        }

        if (i == num) {
            System.out.println("Prime Number");
        }
    }
}