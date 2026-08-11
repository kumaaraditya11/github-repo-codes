import java.util.*;

public class stringlinearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char target = sc.next().charAt(0);

        int pos = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Character not found");
        } else {
            System.out.println("Character found at index " + pos);
        }

        sc.close();
    }
}
