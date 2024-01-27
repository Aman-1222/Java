import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=s.nextInt();
        int r;
        int res=0;
        int i=1;
        while(n>0){
            r=n%2;
            res=r*i+res;
            i*=10;
            n/=2;

        }
        System.out.println(res);
    }
}
