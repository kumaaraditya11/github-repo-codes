import java.util.*;

public class countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str.length()==0) {
            System.out.println("Number of words is 0");
        }
        else{String[] words = str.split("\\s+");
            System.out.print("Number of words is " + words.length);
        }
    }
}

