public class Q3 {
    public static void main(String[] args) {
        int arr[] = {4,3,6,7,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           max=Math.max(arr[i],max);
        }  
        System.out.println(max);                 
    }
}
