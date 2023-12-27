import java.util.Scanner;
public class SumEven {
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
      System.out.println(sum);

    }
     
}
