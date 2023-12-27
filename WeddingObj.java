import java.util.Scanner;
class WeddingObj{
    int guest_no , p_plate;     //instance variables
    String destination;
 
    int Price()                              //method named price inside class
    {
        return guest_no*p_plate;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);         //sc variable of Scanner class is defined or object creation of Scanner class
         WeddingObj details= new WeddingObj();       //similarly details variable of WeddingObj is created or object creation of WeddingObj


         System.out.println("ENTER YOUR DESTINATION ");
         details.destination=sc.nextLine();

         System.out.println("ENTER GUEST NO ");
         details.guest_no=sc.nextInt();

        System.out.println("ENTER PRICE PER PLATE ");
        details.p_plate=sc.nextInt();
        sc.close();

            int total= details.Price();                                      //total me method call kia 

          System.out.println("........................");

          System.out.println("DESTINATION:  " +details.destination);
          System.out.println("GUEST NO:  " +details.guest_no);
          System.out.println("PRICE PER PLATE:  " +details.p_plate);
          System.out.println("TOTAL PRICE IS:  " +total);

    }


}