import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("No. of rows");
    int m = s.nextInt();
    System.out.println("No. of columns");
    
    int n = s.nextInt();
    int arr[][]=new int[m][n];
    int ans=Integer.MIN_VALUE;
    System.out.println("Enter the values");
    for (int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=s.nextInt();
            if(arr[i][j]>ans)
             ans=arr[i][j];
                
        }
    }
    System.out.println(ans);
}
}