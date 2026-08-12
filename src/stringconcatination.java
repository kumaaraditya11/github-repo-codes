import java.util.*;

public class stringconcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String result = str.concat(" ").concat(str1);
        System.out.println(result);
    }
}

