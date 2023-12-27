import java.util.Scanner;
class EvenOdd{
    public void evenodd(){
        try (Scanner eo = new Scanner(System.in)) {           //scanner class ka object
            System.out.println("enter the number");
            int n=eo.nextInt();
            if(n%2==0){
                System.out.println("even number");
            }
            else{
              System.out.println("odd number");
            }
        }
    }
    public static void main(String args[])
    {
        EvenOdd e = new EvenOdd();
        e.evenodd(); 
    }
}
