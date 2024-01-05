public class Q5 {
    public static void main(String[] args) {
       int arr[] = {1,4,7,3,2,6,5};
       int ans=Integer.MIN_VALUE;
       for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {ans=arr[i];
            break;    
            }
    }
        System.out.println(ans);
    }
}
