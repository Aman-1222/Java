import java.util.Scanner;

public class Q5 {
     public static void main(String args[]){
    

        Scanner sc=new Scanner(System.in);
        System.out.println("Num");
        int n=sc.nextInt();
        if(n==0 || n==1){
            System.out.println(true);
        }
        else{
             int low=0,high=n/2;  
             int mid;
             boolean flag=false;
             while(low<=high){
                mid=low+(high-low)/2;
                if(mid*mid==n)
                    {
                        flag=true;
                        break;
                    }
                else if (mid*mid<n) 
                        low=mid+1;
                else
                    high=mid-1;

             }  
             System.out.println(flag);      
        }      
    }       
}
