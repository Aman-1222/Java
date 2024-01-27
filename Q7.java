import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=s.nextInt();
        boolean b=true;
        int count=0;
        while(n>0)
        {
            count+=(n&1);
            if(count==2)
            {
                b=false;
                break;
            }
            n>>=1;
        }
        System.out.println(b);
    }
}
