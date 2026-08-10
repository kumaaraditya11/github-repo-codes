import java.util.Scanner;

public class arraysecondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest, secondl;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(arr[0] > arr[1])
        {
            largest = arr[0];
            secondl = arr[1];
        }
        else
        {
            largest = arr[1];
            secondl = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > largest) {
                secondl = largest;
                largest = arr[i];
            } else if (arr[i] > secondl) {
                secondl = arr[i];
            }
        }
        System.out.println(secondl);
    }
}
