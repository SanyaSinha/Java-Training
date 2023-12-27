import java.util.Scanner;
class Ifmarks{
    public void marks(){
        try (Scanner mar = new Scanner(System.in)) {
            System.out.println("enter marks 1");
           int p1=mar.nextInt();     
            System.out.println("enter marks 2");
           int p2=mar.nextInt();     
            System.out.println("enter marks 3");
           int p3=mar.nextInt();     
           
       if(p1<45 && p2<45 && p3<45){
        System.out.println("fail");
       }
       else{
        System.out.println("pass");
       }
        }
    }
    public static void main(String args[])
    {
        Ifmarks m = new Ifmarks();
        m.marks(); 
    }
    
            }
