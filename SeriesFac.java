import java.util.Scanner;
public class SeriesFac {
    public static void main(String args[]){
        int n,x,i,fact=1;
        double sum=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number n");
        n=sc.nextInt();
        System.out.println("Enter the number x");
        x=sc.nextInt();
        sc.close();
     for(i=1;i<=n;i++)
     {  fact=fact*i;
        sum=sum+(Math.pow(x,i)/fact);    //sum=1+ x/1! + x^2/2! +........x^n/n!
     }
     System.out.println(sum);
    }
}
