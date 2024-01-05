public class Q4 {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>=ans&&i<max)
            ans=i;
        }
        System.out.println(ans);
    }
}
