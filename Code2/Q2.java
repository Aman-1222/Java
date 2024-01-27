import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to add");
        int n=s.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target");
        int t=s.nextInt();
        int low=0;
        int high=n-1;
        int mid;
        int ans=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==t)
                {
                    ans=mid;
                    low=mid+1;
                }
            else if(arr[mid]<t)
                low=mid+1;
            else
                high=mid-1;
        }
        System.out.println("The last occurrence of target is at index : "+ ans);
    }
}
