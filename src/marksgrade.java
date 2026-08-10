import java.util.*;

public class marksgrade{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 or 1:- ");
        int num = sc.nextInt();
        if(num == 0)
        {
            System.out.println("Exited from program.");
        }
        else if(num == 1)
        {
            System.out.println("Enter marks");
            int marks = sc.nextInt();
            if(marks >= 90)
            {
                System.out.println("Excellent");
            }
            else if(marks >= 60 && marks <= 89)
            {
                System.out.println("Average");
            }
            else
            {
                System.out.println("Poor");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
