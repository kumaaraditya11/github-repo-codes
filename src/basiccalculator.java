import java.util.*;

public class basiccalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        int result;

        if(op == '+')
        {
            result = a + b;
            System.out.println(result);
        }
        else if(op == '-')
        {
            result = a - b;
            System.out.println(result);
        }
        else if(op == '*')
        {
            result = a * b;
            System.out.println(result);
        }
        else if(op == '/')
        {
            result = a / b;
            System.out.println(result);
        }
        else if(op == '%')
        {
            result = a % b;
            System.out.println(result);
        }
        else
        {
            System.out.println("Wrong operator");
        }
    }
}
