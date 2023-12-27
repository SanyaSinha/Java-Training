import java.util.Scanner;
class Posneg{
    public void posnega(){
        Scanner eo = new Scanner(System.in);
        System.out.println("enter the number");
        int n=eo.nextInt();
         eo.close();
        if(n>0){
            System.out.println("positive number");
        }
        else if(n<0)
        {
       System.out.println("negative number");
        }
        else{
         System.out.println("zero");
        }
    }
    public static void main(String args[])
    {
        Posneg o = new Posneg();
        o.posnega(); 
    }
    
}
