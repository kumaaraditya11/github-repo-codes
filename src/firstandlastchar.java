import java.util.*;

public class firstandlastchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()>0) {
            System.out.println("First char: " + str.charAt(0));
            System.out.println("Last char: " + str.charAt(str.length()-1));
        }
        else{
            System.out.println("Empty String");
        }
    }
}
