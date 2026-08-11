import java.util.*;

public class comparestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length()>str2.length()){
            System.out.println("string 1 is larger");
        }
        else{
            System.out.println("string 2 is larger");
        }

    }
}
