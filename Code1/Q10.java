import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No. of rows and columns");
        int m = s.nextInt();
        int arr[][]=new int[m][m];
        String row="";
        String column="";
        int mid=m/2;
        System.out.println("Enter the values");
        for (int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
                if(j==mid)
                    column+=arr[i][j]+" ";
                else if(i==mid && i!=j)
                    row+=arr[i][j]+" ";

}
}
System.out.println(column+row);
// for(i = 0 ; i < m ; i++)
//    System.out.print(arr[i][m/2] + "  ");    
// for(j = 0 ; j < m ; j++){
//    if(j == m/2)continue;
//    System.out.print(arr[m/2][j] + "  ");
}
}