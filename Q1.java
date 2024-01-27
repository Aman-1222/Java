import java.util.Scanner;

/**
 * Q1
 */
public class Q1 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no. of elements you want to add");
    int n=s.nextInt();
    System.out.println("Enter the elements of the array");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int ans=-1;
    System.out.println("Enter the element to be searched");
    int se=s.nextInt();
    for(int i=0;i<n;i++)
    {
        if(arr[i]==se)
        {
            ans=i;
            break;
        }
    }
    if(ans!=-1)
        System.out.println(ans);
    else
        System.out.println("Element not found in the array");
}
    
}