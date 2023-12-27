import java.util.Scanner;
class WeekDay {
    public static void main(String args[]){
    //   int ch;
         Scanner sc=new Scanner(System.in);
        // while(true){
            System.out.println("Enter number bewtween 1 to 7");
           int n=sc.nextInt();
            // sc.close();
            switch(n){
                case 1:
                System.out.println("Monday");
                return;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
               default:
                System.out.println("Invalid");
                break;
            // }

        }
    }
}
