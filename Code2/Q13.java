import java.io.*;
import java.util.*;

public class Q13 {
    // 0 based indexing used
    public static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n ; i++)
        {

            int j=i;
            while(j>0 && a[j-1]<a[j])
            {
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }


}