import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        int fact=1,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;++i){
            fact=fact*i;
        }
      System.out.println("fact is " +fact);

    }
    
}
