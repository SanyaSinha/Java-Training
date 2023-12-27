import java.util.Scanner;
class CurrencyDenomination{
    public static void main(String args[]){
        int note2000 , note500 ,note100 , note1 ,remain;
        System.out.println("Enter the currency");
        Scanner sc=new Scanner(System.in);
         int curr = sc.nextInt();
          sc.close();                // always close after the compiler has read this
         System.out.println("cuurency is" +curr);   //say 2502
        note2000= curr/2000;                 //gives 1
        remain = curr%2000;   //gives 502

        note500= remain/500;     //gives 1
        remain = remain%500;                      //gives 2
           
        note100= remain/100;    // gives 0
        remain = remain%100;                     //gives remainder 2

        note1= remain/1;       //gives 2
        
        System.out.println(note2000);
        System.out.println(note500);
        System.out.println(note100);
        System.out.println(note1);

    }

}