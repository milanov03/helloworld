import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        Array arrclass = new Array(arr);
        System.out.println("Min is:" + arrclass.getMin());
        System.out.println("Max is:" + arrclass.getMax());

        /**
         int max = arr[0];
         int min = arr[0];
         System.out.println("Elements of given array: ");
         for (int i = 0; i < a; i++) {
         System.out.print(arr[i] + " ");
         if (max < arr[i]) {
         max = arr[i];
         }
         if (min > arr[i]) {
         min = arr[i];
         }


         }
         System.out.printf("\nThe min number is %d\n", min);
         System.out.printf("The max number is %d\n", max);
         */

    }
}