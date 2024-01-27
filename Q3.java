import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to add");
        int n=s.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int low=0;
        int high=n-1;
        int mid;
        int ans=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==1)
                {
                    ans=mid;
                    high=mid-1;
                }
            else 
                low=mid+1;
        }
        if(ans!=-1)
            System.out.println("The no. of one's in the given array is : "+ (n-ans));
        else
            System.out.println("The no. of one's in the given array is : "+0);
        }
}
