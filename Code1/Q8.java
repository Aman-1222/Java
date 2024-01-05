import java.util.Scanner;

public class Q8 {
 public static void main(String[] args) {
    System.out.println("No. of rows and columns");
    Scanner s=new Scanner(System.in);
    int n = s.nextInt();
    int arr[][]=new int[n][n];
    String st="";
    System.out.println("Enter the values");
    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=s.nextInt();
            if (i==j || i+j==n-1)
                st+=arr[i][j]+" ";
                
        }
    }
    System.out.println(st);
    // String str="";
    // for(int i=0;i<n;i++){
    //     str+=arr[i][i]+" ";
    //     if(i!=n-1-i)
    //         str+=arr[i][n-1-i]+" ";
    // }
    // System.out.println(str);
 }
    
}