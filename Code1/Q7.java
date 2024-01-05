import java.util.*;
public class Q7 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No. of rows and columns");
        int m=s.nextInt();
        
               
        int[][] arr=new int[m][m];
        String ans="";
        System.out.println("Enter the values");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
                if (i+j<m-1)
                    ans+=arr[i][j]+" ";

        }
    
    }
    System.out.println(ans);


}
}

