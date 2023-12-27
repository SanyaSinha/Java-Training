// import java.util.Scanner;
// class EandCSwitchcase {
//     public static void main(String[] args) {
//         while(true){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number bw 1 to 3");
//        int n = sc.nextInt();
//       switch(n)
//    {
//     case 1:
//     System.out.println("Hello");
//     return;
//     case 2 :
//     System.out.println("Sanya");
//     break;
//     case 3:
//     System.out.println("e to enter and c to continue");
//     break;
//    }
//     }
// }
// }

import java.util.Scanner;

public class EandCSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number between 1 to 3:");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Sanya");
                    break;
                case 3:
                    System.out.println("Task 3");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 to 3.");
                    break;
            }

            
            System.out.println("Press 'e' to exit or 'c' to continue:");
            char choice = sc.next().charAt(0);

            switch (choice) {
                case 'e':
                    System.out.println("Exiting...");
                    return;
                case 'c':
                    System.out.println("Continuing...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 'e' to exit or 'c' to continue.");
                    break;
            }
        }
    }
}
