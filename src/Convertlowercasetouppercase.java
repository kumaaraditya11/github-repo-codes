import java.util.*;

public class Convertlowercasetouppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println(upper);
        sc.close();
    }
}
