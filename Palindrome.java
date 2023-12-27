import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        int n,rev=0,rem;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
     System.out.println("Number is" +n);
        sc.close();       
        int temp=n;
        do{
            rem = n%10;       //gives last number
            rev=rev*10+rem;    //stores last number in rev
            n=n/10;                 //removes last digit
        } while(n>0);
        {
            if(temp==rev)
            {
                System.out.println("Palindrome");
            }
            else{
                   System.out.println(" NOT Palindrome");

            }
        }
    }
    
}
