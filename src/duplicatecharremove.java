import java.util.*;

public class duplicatecharremove {
    public class RemoveDuplicateCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            System.out.println(removeDuplicates(input));
        }

        public static String removeDuplicates(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (result.indexOf(c) == -1) {
                    result += c;
                }
            }
            return result;
        }
    }
}
