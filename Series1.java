import java.util.Scanner;
public class Series1 {
    public static void main(String args[]){
        int n,x,i;
        double sum=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number n");
        n=sc.nextInt();
        System.out.println("Enter the number x");
        x=sc.nextInt();
        sc.close();
     for(i=1;i<=n;i++)
     {
        sum=sum+(Math.pow(x,i)/i);    //sum=1+ x/1 + x^2/2 +........x^n/n
     }
     System.out.println(sum);
    }
}
