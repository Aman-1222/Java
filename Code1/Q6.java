import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No. of rows");
        int m=s.nextInt();
        
        System.out.println("No. of columns");
        int n=s.nextInt();
        int pos=0,neg=0,odd=0,even=0,zero=0;

        int[][] arr=new int[m][n];
        System.out.println("Enter the values");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
                if (arr[i][j]>0)
                    pos++;
                else if(arr[i][j]<0)
                    neg++;
                else
                    zero++;
                if (arr[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Number of positive numbers "+pos);
        System.out.println("Number of negative numbers "+neg);
        System.out.println("Number of odd numbers "+odd);
        System.out.println("Number of even numbers "+even);  
        System.out.println("Number of zeros "+zero);  
        
    }
}
