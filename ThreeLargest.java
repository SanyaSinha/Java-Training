import java.util.Scanner;
class ThreeLargest{
    public void largest(){

        System.out.println("enter three numbers");
        Scanner lar=new Scanner(System.in);
        lar.close();                                      //some copiler may not require this line
        int n1=lar.nextInt();
        int n2=lar.nextInt();
        int n3=lar.nextInt();
        if(n1>n2)
        {
            System.out.println("n1 is greater");
        }
        else if(n1>n3)
        {
            System.out.println("n1 is greater");

        }
        else if(n2>n3)
        {
            System.out.println("n2 is greater");
        }
        else
        System.out.println("n3 is greater");

    }
    public static void main(String args[])
    {
        ThreeLargest la = new ThreeLargest();
        la.largest(); 
    }

}