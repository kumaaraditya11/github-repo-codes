import java.util.*;

public class StudentMarksManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {


            
            marks.add(sc.nextInt());
        }
        System.out.println(marks);

        for (int i = 0; i < marks.size(); i += 2) {
            System.out.print(marks.get(i) + " ");
        }
        System.out.println();
        System.out.println("Enter mark to search");
        int mark = sc.nextInt();

        if (marks.contains(mark)) {
            System.out.println(marks.indexOf(mark));
        }
        else System.out.print("Not found");
        marks.set(3, 21);

        marks.remove(5);
        System.out.println(marks);
        System.out.println("Size of array: " + marks.size());
        System.out.println("Max marks: " + Collections.max(marks));
        System.out.println("Min marks: " + Collections.min(marks));
    }
}
