import java.util.Scanner;

public class RevForLOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
         input.close();

        int reversedNumber = 0;
//                 for (; number != 0; number /= 10) {
//             int digit = number % 10; //last digit
//             reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
//         }

//         System.out.println("Reversed number: " + reversedNumber);
//     }
// }
while(number>0)      //123 >0
 {
    int r = number%10;                     //123%10 gives r=3
    reversedNumber= reversedNumber*10 + r;
    number=number/10;
 }
     System.out.println("Reversed number: " + reversedNumber);
}
}